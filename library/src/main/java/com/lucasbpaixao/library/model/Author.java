package com.lucasbpaixao.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private LocalDateTime birthDate;
    private String gender;
    private String literaryEra;
    public Author() {}

    public Author(String name, LocalDateTime birthDate, String gender, String literaryEra) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.literaryEra = literaryEra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
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
}
