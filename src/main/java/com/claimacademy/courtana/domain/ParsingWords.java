package com.claimacademy.courtana.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="parsingWords")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ParsingWords {
    @Id
    @NotNull
    @Column(name = "id", nullable = false, updatable = false)
    private String id;

    @NotNull
    @Size(max = 50)
    @Column(name = "word", nullable = false)
    private String word;

    @NotNull
    @Size(max = 50)
    @Column(name = "conjugation", nullable = false)
    private String conjugation;

    @NotNull
    @Size(max = 50)
    @Column(name = "principlePart", nullable = false)
    private String principlePart;

    @NotNull
    @Size(max = 10)
    @Column(name = "voice", nullable = false)
    private char voice;

    @NotNull
    @Size(max = 50)
    @Column(name = "person", nullable = false)
    private char person;

    @NotNull
    @Size(max = 1)
    @Column(name = "number", nullable = false)
    private char number;

    @NotNull
    @Size(max = 20)
    @Column(name = "tense", nullable = false)
    private String tense;

    @NotNull
    @Size(max = 20)
    @Column(name = "mood", nullable = false)
    private String mood;


    public ParsingWords(){};

    public ParsingWords(String id, String word, String conjugation, String principlePart, char voice, char person, char number, String tense, String mood) {
        this.id = id;
        this.word = word;
        this.conjugation = conjugation;
        this.principlePart = principlePart;
        this.voice = voice;
        this.person = person;
        this.number = number;
        this.tense = tense;
        this.mood = mood;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("id", id)
                .add("word", word)
                .add("conjugation", conjugation)
                .add("principlePart", principlePart)
                .add("voice", voice)
                .add("person", person)
                .add("number", number)
                .add("tense", tense)
                .add("mood", mood)
                .toString();
    }

    public String getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getWord() {
        return word;
    }

//    public void setWord(String word) {
//        this.word = word;
//    }

    public String getConjugation() {
        return conjugation;
    }

//    public void setConjugation(String conjugation) {
//        this.conjugation = conjugation;
//    }

    public String getPrinciplePart() {
        return principlePart;
    }

//    public void setPrinciplePart(String principlePart) {
//        this.principlePart = principlePart;
//    }

    public char getVoice() {
        return voice;
    }

//    public void setVoice(String voice) {
//        this.voice = voice;
//    }

    public char getPerson() {
        return person;
    }

//    public void setPerson(String person) {
//        this.person = person;
//    }

    public char getNumber() {
        return number;
    }

//    public void setNumber(char number) {
//        this.number = number;
//    }

    public String getTense() {
        return tense;
    }

//    public void setTense(char tense) {
//        this.tense = tense;
//    }

    public String getMood() {
        return mood;
    }

//    public void setMood(char mood) {
//        this.mood = mood;
//    }
}
