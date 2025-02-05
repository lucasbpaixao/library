package com.lucasbpaixao.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate birthDate;
    private String gender;
    private String literaryEra;
    public Author() {}

    public Author(String name, LocalDate birthDate, String gender, String literaryEra) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.literaryEra = literaryEra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLiteraryEra() {
        return literaryEra;
    }

    public void setLiteraryEra(String literaryEra) {
        this.literaryEra = literaryEra;
    }

    public void update(Author author) throws NullPointerException {
        if(!author.getName().equals(this.name)) {
            this.name = author.getName();
        }
        if(!author.getBirthDate().equals(this.birthDate)) {
            this.birthDate = author.getBirthDate();
        }
        if(!author.getGender().equals(this.gender)) {
            this.gender = author.getGender();
        }
        if(!author.getLiteraryEra().equals(this.literaryEra)) {
            this.literaryEra = author.getLiteraryEra();
        }
    }
}
