package com.mybank.bankserver.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CardEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cardId;
	private Long custId;
	private String cardNumber;
	private Long cardCvv;
	private String expirationDate;
	
	
	public CardEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCardId() {
		return cardId;
	}
	public void setCardId(Long cardId) {
		this.cardId = cardId;
	}
	public Long getCustId() {
		return custId;
	}
	public void setCustId(Long custId) {
		this.custId = custId;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Long getCardCvv() {
		return cardCvv;
	}
	public void setCardCvv(Long cardCvv) {
		this.cardCvv = cardCvv;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	

}
