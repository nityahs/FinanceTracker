package com.example.Budget.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "budgets")

public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private Double amount;

    public Budget(Long id, String category, Double amount) {
        this.id = id;
        this.category = category;
        this.amount = amount;
    }
    public Budget(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }


}