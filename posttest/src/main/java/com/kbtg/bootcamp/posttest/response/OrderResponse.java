package com.kbtg.bootcamp.posttest.response;

import java.util.List;

public class OrderResponse {

    List<String> tickets;
    private Integer count;
    private Integer cost;

    public List<String> getTickets() {
        return tickets;
    }

    public Integer getCount() {
        return count;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public void setTickets(List<String> tickets) {
        this.tickets = tickets;
    }

}
