package com.mybank.bankserver.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mybank.bankserver.entity.CardEntity;
import com.mybank.bankserver.entity.CustomerEntity;
import com.mybank.bankserver.service.BankServerUtilService;


@RestController
@RequestMapping("/server-api")
public class BankServerApi {
	
	@Autowired
	private BankServerUtilService bankServerService;
	
	
	@GetMapping(path = "/customers", produces = {MediaType.APPLICATION_JSON_VALUE})	
	public ResponseEntity<?> fetchCustomers(){
		
		return bankServerService.getCustomerList();
	}

	@GetMapping(path = "/customers/{custId}", produces = {MediaType.APPLICATION_JSON_VALUE})		
	public ResponseEntity<?> getCustomerById(@PathVariable String custId){
		
		return null;
	}
	
	@PostMapping(path = "/register", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> registerCustomer(@RequestBody CustomerEntity customer){
		
		return bankServerService.registerCustomer(customer);
	}

	@PostMapping(path = "/validate", consumes = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> validateCustoerCard(@RequestBody CardEntity card){
		
		return bankServerService.validateCard(card);
	}
	
}
