package com.mybank.bankserver.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class CustomerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long custId;
	private String custFirstName;
	private String custLastName;
	@Embedded
	private Address custAddress;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "custId", referencedColumnName = "custId" )
	private List<CardEntity> cards;
	

	
	
	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getCustFirstName() {
		return custFirstName;
	}

	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}

	public String getCustLastName() {
		return custLastName;
	}

	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}

	public Address getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(Address custAddress) {
		this.custAddress = custAddress;
	}

	public List<CardEntity> getCards() {
		return cards;
	}

	public void setCards(List<CardEntity> cards) {
		this.cards = cards;
	}
	
	
}
