package com.example.models;

import jakarta.persistence.MappedSuperclass;
import lombok.*;

import java.time.LocalDate;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Person {
    private String name;
    private LocalDate dateOfBirth;
    private String address;

    public int calculateAge() {
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }
}