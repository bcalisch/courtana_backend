package com.claimacademy.courtana.service;

import com.claimacademy.courtana.domain.Citations;
import com.claimacademy.courtana.repository.CitationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CitationServiceImpl implements CitationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CitationServiceImpl.class);
    private final CitationRepository repository;

    @Autowired
    public CitationServiceImpl(CitationRepository repository) {
        this.repository = repository;
    }

    @Override
    public Citations save(Citations commonPhrase) {
        return null;
    }

    @Override
    @Transactional
    public List<Citations> getList() {
        LOGGER.debug("Retrieving the list of all parsing words");

        return repository.findAll();
    }

    @Override
    public  List<Citations>  getCitations(String drivers_license_number) {

        return repository.findByDrivers_license_number(drivers_license_number);
    }
}
