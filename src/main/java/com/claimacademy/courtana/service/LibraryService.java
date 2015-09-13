package com.claimacademy.courtana.service;

import com.claimacademy.courtana.domain.User;

public interface LibraryService {

	/**
	 * Validates user based on library card number and entered pin
	 * 
	 * @param cardNumber
	 * @param pin
	 * @return User
	 */
	public User validateUser(String cardNumber, String pin);
}
