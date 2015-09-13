package com.claimacademy.courtana.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.google.common.base.Objects;

@Entity
@Table(name = "library_card")
public class User {

	public User() {
	}

	@Id
	@NotNull
	@Size(max = 64)
	private String CARD_NUMBER;

	@NotNull
	@Size(max = 64)
	private String pin;

	@Size(max = 250)
	private String drivers_license_number;

	@Size(max = 250)
	private String first_name;

	@NotNull
	@Size(max = 250)
	private String last_name;

	@NotNull
	@Size(max = 250)
	private String street;

	@Size(max = 250)
	private String street_2;

	@NotNull
	@Size(max = 250)
	private String city;

	@NotNull
	@Size(max = 250)
	private String state;

	@NotNull
	@Size(max = 250)
	private String zip;

	@NotNull
	@Size(max = 250)
	private String email;

	public User(final String CARD_NUMBER, final String pin,
			String drivers_license_number, String first_name, String last_name,
			String street, String street_2, String city, String state,
			String zip, String email) {
		this.CARD_NUMBER = CARD_NUMBER;
		this.pin = pin;
		this.drivers_license_number = drivers_license_number;
		this.first_name = first_name;
		this.last_name = last_name;
		this.street = street;
		this.street_2 = street_2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.email = email;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("CARD_NUMBER", CARD_NUMBER)
				.add("pin", pin)
				.add("drivers_license_number", drivers_license_number)
				.add("first_name", first_name).add("last_name", last_name)
				.add("street", street).add("street_2", street_2)
				.add("city", city).add("state", state).add("zip", zip)
				.add("email", email).toString();
	}
}
