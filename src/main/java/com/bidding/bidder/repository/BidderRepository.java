package com.bidding.bidder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bidding.bidder.entity.Bidder;

public interface BidderRepository extends JpaRepository<Bidder, Long> {
    List<Bidder> findByUserId(Long userId);
    List<Bidder> findBySlotId(Long slotId);
}
