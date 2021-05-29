package com.mybank.bankserver.service;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mybank.bankserver.entity.CardEntity;
import com.mybank.bankserver.entity.CustomerEntity;
import com.mybank.bankserver.entity.MessageResponse;
import com.mybank.bankserver.repository.CardRepository;
import com.mybank.bankserver.repository.CustomerRepository;


@Service
public class BankServerUtilService {
	
	
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CardRepository cardRepository;
	
	
	public BankServerUtilService() {
		super();
	}
	
	public ResponseEntity<?> registerCustomer(CustomerEntity customer){
		
		return new ResponseEntity<>(customerRepository.saveAndFlush(customer), HttpStatus.CREATED);
	}
	
	public ResponseEntity<?> findCustomerById(String custId){
		
		return new ResponseEntity<>(customerRepository.findById(Long.parseLong(custId)), HttpStatus.ACCEPTED);
	}

	public ResponseEntity<?> getCustomerList(){
		
		return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
	}
	
	public ResponseEntity<?> validateCard(CardEntity card){
		
		DateTimeFormatter experDateFormat = DateTimeFormatter.ofPattern("MM-yyyy");
		CardEntity custCard = cardRepository.findByCustId(card.getCustId())
								.stream().filter(c -> c.getCardNumber().equals(card.getCardNumber()))
								.findFirst().orElse(null);
		if(!custCard.equals(null)) {
			if(YearMonth
					.parse(card.getExpirationDate(), experDateFormat)
					.compareTo(YearMonth.now()) < 0) 
				return new ResponseEntity<>(new MessageResponse("Card has expired !"), HttpStatus.BAD_REQUEST);
			else if(!card.getCardCvv().equals(custCard.getCardCvv()))
				return new ResponseEntity<>(new MessageResponse("Bad Card CVV code !"), HttpStatus.BAD_REQUEST);
			else 
				return new ResponseEntity<>(new MessageResponse("Card Validation Succeded !"), HttpStatus.ACCEPTED);			
		}
		else
			return new ResponseEntity<>(new MessageResponse("Customer Card Not Found !"), HttpStatus.BAD_REQUEST);		
			
	}
	
}
