package com.claimacademy.courtana.service;

import com.claimacademy.courtana.domain.Citations;

import java.util.List;

/**
 * Created by benjamin on 9/3/15.
 */
public interface CitationService {
    Citations save(Citations commonPhrase);

    List<Citations> getList();

    List<Citations> getCitations(String licenseNumber);
}
