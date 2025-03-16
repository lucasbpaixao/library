package com.lucasbpaixao.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.Arrays;

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

    public void update(Author newAuthor) throws NullPointerException {
        if(newAuthor.getName() != null){
            if(!newAuthor.getName().equals(this.name)) {
                this.name = newAuthor.getName();
            }
        }

        if(newAuthor.getBirthDate() != null){
            if(!newAuthor.getBirthDate().equals(this.birthDate)) {
                this.birthDate = newAuthor.getBirthDate();
            }
        }

        if(newAuthor.getGender() != null){
            if(!newAuthor.getGender().equals(this.gender)) {
                this.gender = newAuthor.getGender();
            }
        }

        if(newAuthor.getLiteraryEra() != null){
            if(!newAuthor.getLiteraryEra().equals(this.literaryEra)) {
                this.literaryEra = newAuthor.getLiteraryEra();
            }
        }
    }
}
