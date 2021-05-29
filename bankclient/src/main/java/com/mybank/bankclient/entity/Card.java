package com.mybank.bankclient.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Card {
	
	private Long custId;
	private String cardNumber;
	private Long cardCvv;
	private String expirationDate;

	public Card() {
		super();
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
