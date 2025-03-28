package com.lucasbpaixao.library.model;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Inventory {
    public Inventory() {}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne(cascade = CascadeType.ALL)
    private Book book;
    private LocalDateTime updatedAt;
    private int availableQuantity;

    public Inventory(Book book, int availableQuantity) {
        this.book = book;
        this.availableQuantity = availableQuantity;
        this.updatedAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public void decreaseAvailableBooksOnRent(){
        this.availableQuantity--;
        this.updatedAt = LocalDateTime.now();
    }
}
