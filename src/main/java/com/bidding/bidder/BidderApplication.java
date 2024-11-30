package com.bidding.bidder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BidderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BidderApplication.class, args);
	}

}
