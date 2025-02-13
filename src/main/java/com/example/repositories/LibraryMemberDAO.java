package com.example.repositories;

import com.example.models.LibraryMember;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class LibraryMemberDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void addMember(LibraryMember member) {
        entityManager.persist(member);
    }

    public List<LibraryMember> getAllMembers() {
        return entityManager.createQuery("SELECT m FROM LibraryMember m", LibraryMember.class).getResultList();
    }

    public LibraryMember getMemberById(Long id) {
        return entityManager.find(LibraryMember.class, id);
    }

    public void deleteMember(Long id) {
        LibraryMember member = getMemberById(id);
        if (member != null) {
            entityManager.remove(member);
        }
    }
}