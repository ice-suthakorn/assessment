package com.kbtg.bootcamp.posttest.service;

import com.kbtg.bootcamp.posttest.orderLottery.Lottery;
import com.kbtg.bootcamp.posttest.orderLottery.LotteryRepository;
import com.kbtg.bootcamp.posttest.orderLottery.LotteryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LotteryService {
    @Autowired
    private final LotteryRepository lotteryRepository;

    public LotteryService(LotteryRepository lotteryRepository) {
        this.lotteryRepository = lotteryRepository;
    }

    public String createLottery(LotteryRequest request){
        Lottery lottery = new Lottery();
        lottery.setTicket(request.ticket());
        lottery.setPrice(request.price());
        lottery.setAmount(request.amount());
        lotteryRepository.save(lottery);

        return lottery.getTicket();
    }

    public List<String> getByTicketLottery(){
       return lotteryRepository.findAllByTicket();

    }

}
