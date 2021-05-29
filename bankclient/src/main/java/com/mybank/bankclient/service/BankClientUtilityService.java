package com.mybank.bankclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.mybank.bankclient.entity.Card;
import com.mybank.bankclient.entity.CustomerEntity;


@Service
public class BankClientUtilityService {

	
	@Autowired
	private RestTemplate restTemplate;
	private static final String BANK_SERVER_URI = "http://localhost:8081/server-api";
	
	
	public BankClientUtilityService() {
		super();
	}

	public ResponseEntity<?> registerCustomer(CustomerEntity customer){
		return null;
	}
	
	public ResponseEntity<?> verifyCardDetail(Card card){
		
		return null;
	}
	
	public ResponseEntity<?> getCustomer(String custId){
		
		return null;
	}
	
	
}
