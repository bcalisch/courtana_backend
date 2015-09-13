package com.claimacademy.courtana.service;

import com.claimacademy.courtana.domain.User;
import com.claimacademy.courtana.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.inject.Inject;
import java.util.List;

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
	public List<User> validateUser(String cardNumber, String pin) {
		List<User> existingUser = repository.findByLibraryCard(cardNumber);
		if (existingUser != null) {
			if (LOGGER.isInfoEnabled()) {
				LOGGER.info("User Found!");
			}
			return existingUser;
		}
		return null;
	}
}
