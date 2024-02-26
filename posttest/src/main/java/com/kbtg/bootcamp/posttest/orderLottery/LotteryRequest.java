package com.kbtg.bootcamp.posttest.orderLottery;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record LotteryRequest
        (
                @NotNull
                @Size(
                  max = 6,
                  min = 6,
                  message = ("ticket: Please enter 6 numbers")
                )
                String ticket,
                @NotNull
                Integer price,
                @NotNull
                Integer amount
        )
{ }
