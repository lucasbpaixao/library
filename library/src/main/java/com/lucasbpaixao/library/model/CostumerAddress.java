package com.lucasbpaixao.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CostumerAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cep;
    private String street;
    private String number;
    private String city;

    public CostumerAddress() {
    }

    public CostumerAddress(String cep, String street, String number, String city) {
        this.cep = cep;
        this.street = street;
        this.number = number;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void update(CostumerAddress newAddress) {
        if(newAddress.getCep() != null) {
            if(!newAddress.getCep().equals(this.cep)) {
                this.cep = newAddress.getCep();
            }
        }

        if(newAddress.getStreet() != null) {
            if(!newAddress.getStreet().equals(this.street)) {
                this.street = newAddress.getStreet();
            }
        }

        if(newAddress.getNumber() != null) {
            if(!newAddress.getNumber().equals(this.number)) {
                this.number = newAddress.getNumber();
            }
        }


        if(newAddress.getCity() != null) {
            if(!newAddress.getCity().equals(this.city)) {
                this.city = newAddress.getCity();
            }
        }
    }
}
