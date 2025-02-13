package com.example.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String isbn;
    private String genre;
    private int publicationYear;
    private boolean isBorrowed;



    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;


    public void setBorrowed(boolean borrowed) {
        this.isBorrowed = borrowed;
    }

    @ManyToOne
    @JoinColumn(name = "member_id")
    private LibraryMember borrowedBy;
}