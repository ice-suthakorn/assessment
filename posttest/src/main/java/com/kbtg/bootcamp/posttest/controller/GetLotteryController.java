package com.kbtg.bootcamp.posttest.controller;

import com.kbtg.bootcamp.posttest.service.LotteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class GetLotteryController {

    @Autowired
    private final LotteryService lotteryService;

    public GetLotteryController(LotteryService lotteryService) {
        this.lotteryService = lotteryService;
    }

    @GetMapping("/lotteries")
    public List<String> getByTicketLottery(){
        return lotteryService.getByTicketLottery();
    }

}
