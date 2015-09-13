package com.claimacademy.courtana.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.claimacademy.courtana.domain.User;
import com.claimacademy.courtana.service.LibraryService;
import com.claimacademy.courtana.service.exception.UserAlreadyExistsException;

@RestController
public class UserController {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(UserController.class);
	private final LibraryService libraryService;

	@Inject
	public UserController(final LibraryService libraryService) {
		this.libraryService = libraryService;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public User validateLibraryUser() {
		LOGGER.debug("Received request to list all users");
		User user = libraryService.validateUser("123", "1234");

		return user;
	}

	@ExceptionHandler
	@ResponseStatus(HttpStatus.CONFLICT)
	public String handleUserAlreadyExistsException(UserAlreadyExistsException e) {
		return e.getMessage();
	}

}
