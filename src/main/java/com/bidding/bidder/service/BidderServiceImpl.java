package com.bidding.bidder.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bidding.bidder.entity.Bidder;
import com.bidding.bidder.repository.BidderRepository;
import com.bidding.bidder.restCallHandler.UserClient;

import jakarta.transaction.Transactional;

@Service
public class BidderServiceImpl implements BidderService {

	@Autowired
    private  BidderRepository bidderRepository;
	
	@Autowired
	private UserClient userClient;

	@Transactional
    public Bidder createBidder(Bidder bidder) {
		userClient.getUserById(bidder.getUserId());
        return bidderRepository.save(bidder);
    }

    public Optional<Bidder> getBidderById(Long bidderId) {
        return bidderRepository.findById(bidderId);
    }

    public List<Bidder> getBiddersByUserId(Long userId) {
        return bidderRepository.findByUserId(userId);
    }

    public List<Bidder> getBiddersBySlotId(Long slotId) {
        return bidderRepository.findBySlotId(slotId);
    }

    @Transactional
    public void deleteBidder(Long bidderId) {
        bidderRepository.deleteById(bidderId);
    }
}
