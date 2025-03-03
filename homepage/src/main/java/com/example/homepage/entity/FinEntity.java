package com.example.homepage.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class FinEntity {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionid;
    private long UserId;
    private String currency;
    private String transactionDate;
    private float tranAmt;
    private String transtype; //tells if transaction is income or expenditure
    private String label; //denotes the area of transaction



    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public int getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(int transactionid) {
        this.transactionid = transactionid;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public float getTranAmt() {
        return tranAmt;
    }

    public void setTranAmt(float tranAmt) {
        this.tranAmt = tranAmt;
    }



}
