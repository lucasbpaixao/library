package com.lucasbpaixao.library.enums;

public enum RentStatus {
    RETURNED("Devolvido"),OVERDUE("Atrasado"),ON_LOAN("Emprestado");

    private final String statusDescription;
    RentStatus(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

}
