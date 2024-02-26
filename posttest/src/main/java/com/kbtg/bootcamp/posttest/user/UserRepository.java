package com.kbtg.bootcamp.posttest.user;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserTicket, Integer> {

    @Query("SELECT count(u) FROM UserTicket u WHERE u.userId = :userId")
    Integer countUserId(@Param("userId") Integer userId);
    @Query("SELECT u.ticketId FROM UserTicket u WHERE u.userId = :userId")
    List<String> getUserlottery(@Param("userId") Integer userId);
    @Modifying
    @Transactional
    @Query("DELETE FROM UserTicket u WHERE u.userId = :userId AND u.ticketId = :ticketId")
    void deleteLotteryByUser(@Param("userId") Integer userId, @Param("ticketId") String ticketId);

}
