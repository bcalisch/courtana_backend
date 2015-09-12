package com.claimacademy.courtana.service;

import com.claimacademy.courtana.domain.ParsingWords;

import java.util.List;

/**
 * Created by benjamin on 8/24/15.
 */
public interface ParsingWordsService {
    ParsingWords save(ParsingWords parsingWords);

    List<ParsingWords> getList();

    ParsingWords getWord(String id);
}
