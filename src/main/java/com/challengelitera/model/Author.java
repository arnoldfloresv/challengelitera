package com.challengelitera.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate birthDate;
    private LocalDate deathDate;

    // Getters and Setters
}
