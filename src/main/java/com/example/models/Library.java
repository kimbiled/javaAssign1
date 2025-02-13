package com.example.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String libraryName;
    private String address;
    private String workingHours;

    @OneToMany(mappedBy = "library", cascade = CascadeType.ALL)
    private List<Book> books;

    @OneToMany(mappedBy = "library", cascade = CascadeType.ALL)
    private List<LibraryMember> members;

    private int totalBooksBorrowed;
    private double totalFinesCollected;



    public void incrementTotalBooksBorrowed() {
        totalBooksBorrowed++;
    }

    // Метод обновления собранных штрафов
    public void updateTotalFinesCollected(double amount) {
        totalFinesCollected += amount;
    }
}