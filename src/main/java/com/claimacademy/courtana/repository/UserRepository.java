package com.claimacademy.courtana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.claimacademy.courtana.domain.User;

public interface UserRepository extends JpaRepository<User, String> {

	@Query("SELECT c.CARD_NUMBER, c.pin, c.drivers_license_number, c.first_name, c.last_name, c.street, c.street_2, c.city, c.state, c.zip, c.email FROM LIBRARY_CARD c WHERE c.CARD_NUMBER = :CARD_NUMBER")
	User findByLibraryCard(
			@Param("drivers_license_number") String library_card_number);

}
