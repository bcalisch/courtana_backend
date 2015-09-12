package com.claimacademy.courtana.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.google.common.base.Objects;

@Entity
public class User {

	User() {
	}

	@Id
	@NotNull
	@Size(max = 64)
	@Column(name = "CARD_NUMBER", nullable = false, updatable = false)
	private String cardNumber;

	@NotNull
	@Size(max = 64)
	@Column(name = "pin", nullable = false)
	private String pin;

	public User(final String cardNumber, final String pin) {
		this.cardNumber = cardNumber;
		this.pin = pin;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public String getPin() {
		return pin;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("Card Number: ", cardNumber)
				.add(" Pin: ", pin).toString();
	}
}
