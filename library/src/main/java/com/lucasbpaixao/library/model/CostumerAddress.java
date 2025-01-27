package com.lucasbpaixao.library.model;

public class CostumerAddress {
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
}
