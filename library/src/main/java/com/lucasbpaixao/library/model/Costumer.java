package com.lucasbpaixao.library.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Costumer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDate birthDate;
    @OneToOne(cascade = CascadeType.ALL)
    private CostumerAddress costumerAddress;
    private String email;
    private String phone;
    private String backupPhone;
    private String cpf;
    private String gender;

    public Costumer() {
    }

    public Costumer(String name, LocalDate birthDate, CostumerAddress costumerAddress, String email, String phone, String backupPhone, String cpf, String gender) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
        this.birthDate = birthDate;
        this.costumerAddress = costumerAddress;
        this.email = email;
        this.phone = phone;
        this.backupPhone = backupPhone;
        this.cpf = cpf;
        this.gender = gender;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public CostumerAddress getCostumerAddress() {
        return costumerAddress;
    }

    public void setCostumerAddress(CostumerAddress costumerAddress) {
        this.costumerAddress = costumerAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBackupPhone() {
        return backupPhone;
    }

    public void setBackupPhone(String backupPhone) {
        this.backupPhone = backupPhone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
