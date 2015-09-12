package com.claimacademy.courtana.repository;

import com.claimacademy.courtana.domain.Citations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by benjamin on 9/3/15.
 */
public interface CitationRepository extends JpaRepository<Citations, String> {

    @Query("SELECT c.first_name, c.last_name, c.court_date FROM Citations c WHERE c.drivers_license_number = :drivers_license_number")

     List<Citations> findByDrivers_license_number(@Param("drivers_license_number")String drivers_license_number);
    
    @Query("select c.*, v.* from citations c left join violations v on c.citation_number = v.citation_number where drivers_license_number = :drivers_license_number")
    
    List<Citations> citationsJoinedValidations(@Param("drivers_license_number") String drivers_license_number);
}
