package com.example.repositories;

import com.example.models.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class BookDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void addBook(Book book) {
        entityManager.persist(book);
    }

    public List<Book> getAllBooks() {
        return entityManager.createQuery("SELECT b FROM Book b", Book.class).getResultList();
    }

    public Book getBookById(Long id) {
        return entityManager.find(Book.class, id);
    }

    public void updateBookStatus(Long id, boolean isBorrowed) {
        Book book = getBookById(id);
        if (book != null) {
            book.setBorrowed(isBorrowed);
            entityManager.merge(book);
        }
    }

    public void deleteBook(Long id) {
        Book book = getBookById(id);
        if (book != null) {
            entityManager.remove(book);
        }
    }
}