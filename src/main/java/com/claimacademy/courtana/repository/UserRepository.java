package com.claimacademy.courtana.repository;

import com.claimacademy.courtana.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

	@Query("SELECT c.pin, c.drivers_license_number, c.first_name, c.last_name, c.street, c.street_two, c.city, c.state, c.zip, c.email FROM User c WHERE c.CARD_NUMBER = :CARD_NUMBER")
	List<User> findByLibraryCard(@Param("CARD_NUMBER") String CARD_NUMBER);

}
