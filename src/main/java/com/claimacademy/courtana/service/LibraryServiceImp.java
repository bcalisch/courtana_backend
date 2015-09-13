package com.claimacademy.courtana.service;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.claimacademy.courtana.domain.User;
import com.claimacademy.courtana.repository.UserRepository;

@Service
@Validated
public class LibraryServiceImp implements LibraryService {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(LibraryServiceImp.class);
	private final UserRepository repository;

	@Inject
	public LibraryServiceImp(final UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public User validateUser(String cardNumber, String pin) {
		User existingUser = repository.findByLibraryCard(cardNumber);
		if (existingUser != null) {
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("User Found!");
			}
			return existingUser;
		}
		return null;
	}
}
