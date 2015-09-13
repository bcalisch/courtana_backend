package com.claimacademy.courtana.controller;

import com.claimacademy.courtana.domain.User;
import com.claimacademy.courtana.service.LibraryService;
import com.claimacademy.courtana.service.exception.UserAlreadyExistsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import java.util.List;

@RestController
public class UserController {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(UserController.class);
	private final LibraryService libraryService;

	@Inject
	public UserController(final LibraryService libraryService) {
		this.libraryService = libraryService;
	}

	@RequestMapping(value = "/user/{card_number}/{pin}", method = RequestMethod.GET)
	public List<User> validateLibraryUser(@PathVariable String card_number, @PathVariable String pin) {
		LOGGER.debug("Received request to list all users");
		List<User> user = libraryService.validateUser(card_number, pin);

		return user;
	}

	@ExceptionHandler
	@ResponseStatus(HttpStatus.CONFLICT)
	public String handleUserAlreadyExistsException(UserAlreadyExistsException e) {
		return e.getMessage();
	}

}
