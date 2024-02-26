package com.kbtg.bootcamp.posttest.orderLottery;

import jakarta.persistence.*;

@Entity
@Table(name="lottery")
public class Lottery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ticket;
    private double price;
    private Integer amount;

    public Integer getId() {
        return id;
    }

    public String getTicket() {
        return ticket;
    }

    public double getPrice() {
        return price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
