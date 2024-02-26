package com.kbtg.bootcamp.posttest.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "user_ticket")
public class UserTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    private Integer userId;
    @NotNull
    private String ticketId;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setTicketId(String  ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getTicketId() {
        return ticketId;
    }


}
