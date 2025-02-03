package com.lucasbpaixao.library.model;

import com.lucasbpaixao.library.enums.RentStatus;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Rent {
    public Rent() {
    }

    public Rent(List<Book> book, Costumer costumer) {
        this.book = book;
        this.costumer = costumer;
        this.rentDate = LocalDateTime.now();
        this.returnDate = rentDate.plusDays(7);
        this.rentStatus = RentStatus.ON_LOAN;
        this.overdueFine = new BigDecimal("0.0");
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToMany(cascade = CascadeType.DETACH)
    private List<Book> book;
    @ManyToOne(cascade = CascadeType.DETACH)
    private Costumer costumer;
    private LocalDateTime rentDate;
    private LocalDateTime returnDate;
    private RentStatus rentStatus;
    private BigDecimal overdueFine;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Book> getBook() {
        return book;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public LocalDateTime getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDateTime rentDate) {
        this.rentDate = rentDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public RentStatus getRentStatus() {
        return rentStatus;
    }

    public void setRentStatus(RentStatus rentStatus) {
        this.rentStatus = rentStatus;
    }

    public BigDecimal getOverdueFine() {
        return overdueFine;
    }

    public void setOverdueFine(BigDecimal overdueFine) {
        this.overdueFine = overdueFine;
    }
}
