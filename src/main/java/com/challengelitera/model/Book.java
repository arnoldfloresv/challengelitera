package com.challengelitera.model;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String language;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    // Getters and Setters
}

