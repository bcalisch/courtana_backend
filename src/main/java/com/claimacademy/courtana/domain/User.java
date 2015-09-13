package com.claimacademy.courtana.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.google.common.base.Objects;

@Entity
public class User {

	public User() {
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

	@Column(name = "drivers_license_number")
	private String driversLicense;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@NotNull
	@Column(name = "street")
	private String street;

	@Column(name = "street_2")
	private String streetTwo;

	@NotNull
	@Column(name = "city")
	private String city;

	@NotNull
	@Column(name = "state")
	private String state;

	@NotNull
	@Column(name = "zip")
	private String zip;

	@NotNull
	@Column(name = "email")
	private String email;

	public User(final String cardNumber, final String pin,
			String driversLicense, String firstName, String lastName,
			String street, String streetTwo, String city, String state,
			String zip, String email) {
		this.cardNumber = cardNumber;
		this.pin = pin;
		this.driversLicense = driversLicense;
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.streetTwo = streetTwo;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public String getPin() {
		return pin;
	}

	public String getDriversLicense() {
		return driversLicense;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getStreet() {
		return street;
	}

	public String getStreetTwo() {
		return streetTwo;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("Card Number: ", cardNumber)
				.add(" Pin: ", pin).toString();
	}
}
