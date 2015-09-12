package com.claimacademy.courtana.controller;

import com.claimacademy.courtana.domain.Citations;
import com.claimacademy.courtana.service.CitationService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
public class CitationController {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(CitationController.class);
    private final CitationService citationService;

    @Inject
    public CitationController(CitationService citationService){
        this.citationService = citationService;
    }

    @RequestMapping(value = "/citations", method = RequestMethod.GET)
    public List<Citations> listCitations(@RequestParam String drivers_license_number) {
        LOGGER.debug("Received request to list all parsing words");
        System.out.println("drivers_license_number = " + drivers_license_number);
        List<Citations> citations = citationService.getCitations(drivers_license_number);
        System.out.println("citations.length" +citations.size());
        return citationService.getCitations(drivers_license_number);
    }
    @RequestMapping(value = "/phrase", method = RequestMethod.GET)
    public List<Citations> getWord() {
        LOGGER.debug("Received request to return a single word of ID:");
//        return commonPhraseService.getPhrase(id);
        return citationService.getList();
    }

}
