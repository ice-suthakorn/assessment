package com.kbtg.bootcamp.posttest.controller;

import com.kbtg.bootcamp.posttest.orderLottery.LotteryRequest;
import com.kbtg.bootcamp.posttest.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/lotteries")
public class AdminCreateLotteryController {
    @Autowired
    private final LotteryService lotteryService;

    public AdminCreateLotteryController(LotteryService lotteryService) {
        this.lotteryService = lotteryService;
    }
    @PostMapping("")
    public String createLottery(@Validated @RequestBody LotteryRequest request){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return lotteryService.createLottery(request);
    }
}
