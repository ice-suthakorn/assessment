package com.kbtg.bootcamp.posttest.service;

import com.kbtg.bootcamp.posttest.response.OrderResponse;
import com.kbtg.bootcamp.posttest.user.UserRepository;
import com.kbtg.bootcamp.posttest.user.UserTicket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Integer buyLotteryOrder(Integer userId, String ticketId){

        UserTicket userTicket = new UserTicket();
        userTicket.setUserId(userId);
        userTicket.setTicketId(ticketId);
        userRepository.save(userTicket);
        return userTicket.getId();
    }

    public OrderResponse getUserlottery(Integer userId){

        List<String> lotteryList = userRepository.getUserlottery(userId);
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setTickets(lotteryList);
        orderResponse.setCount(lotteryList.size());
        orderResponse.setCost(lotteryList.size() * 80);
        return orderResponse;

    }

    public void deleteLotteryOrder(Integer userId, String ticketId){
        userRepository.deleteLotteryByUser(userId, ticketId);

    }



}
