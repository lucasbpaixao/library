package com.lucasbpaixao.library.model;

import com.lucasbpaixao.library.enums.RentStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Rent {
    public Rent() {
    }

    public Rent(Book book, Costumer costumer) {
        this.book = book;
        this.costumer = costumer;
        this.rentDate = LocalDateTime.now();
        this.returnDate = rentDate.plusDays(7);
        this.rentStatus = RentStatus.ON_LOAN;
        this.overdueFine = new BigDecimal("0.0");
    }

    private int id;
    private Book book;
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
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
