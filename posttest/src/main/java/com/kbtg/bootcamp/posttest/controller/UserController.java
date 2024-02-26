package com.kbtg.bootcamp.posttest.controller;

import com.kbtg.bootcamp.posttest.response.OrderResponse;
import com.kbtg.bootcamp.posttest.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users/{userId}/lotteries/{ticketId}")
    public Integer buyLotteryOrder(@Validated @PathVariable Integer userId, @PathVariable String ticketId){
        return userService.buyLotteryOrder(userId, ticketId);
    }

    @GetMapping("/users/{userId}/lotteries")
    public OrderResponse getUserlottery (@PathVariable Integer userId){
    return userService.getUserlottery(userId);
    }

    @DeleteMapping("/users/{userId}/lotteries/{ticketId}")
    public void deleteLotteryOrder(@PathVariable Integer userId, @PathVariable String ticketId){
          userService.deleteLotteryOrder(userId, ticketId);
    }
}
