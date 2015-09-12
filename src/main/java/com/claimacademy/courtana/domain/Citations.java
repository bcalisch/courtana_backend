package com.claimacademy.courtana.domain;


import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="citations")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Citations {

    @Id
    @NotNull
    @Column(name = "id")
    private String id;

    @NotNull
    @Size(max = 11)
    @Column(name = "citation_number", nullable = false)
    private String citation_number;

    @NotNull
    @Size(max = 250)
    @Column(name = "citation_date")
    private String citation_date;

    @NotNull
    @Size(max = 250)
    @Column(name = "first_name")
    private String first_name;

    @NotNull
    @Size(max = 250)
    @Column(name = "last_name")
    private String last_name;

    @NotNull
    @Size(max = 250)
    @Column(name = "date_of_birth")
    private String date_of_birth;

    @NotNull
    @Size(max = 250)
    @Column(name = "defendant_address")
    private String defendant_address;

    @NotNull
    @Size(max = 250)
    @Column(name = "defendant_city")
    private String defendant_city;
    @NotNull
    @Size(max = 250)
    @Column(name = "defendant_state")
    private String defendant_state;

    @NotNull
    @Size(max = 250)
    @Column(name = "drivers_license_number")
    private String drivers_license_number;

    @NotNull
    @Size(max = 250)
    @Column(name = "court_date")
    private String court_date;

    @NotNull
    @Size(max = 250)
    @Column(name = "court_location")
    private String court_location;

    @NotNull
    @Size(max = 250)
    @Column(name = "court_address")
    private String court_address;

    public Citations() {
    }

    public Citations(String id, String citation_number, String citation_date, String first_name,
                     String last_name, String date_of_birth, String defendant_address,
                     String defendant_city, String defendant_state, String drivers_license_number,
                     String court_date, String court_location, String court_address) {
        this.id = id;
        this.citation_number = citation_number;
        this.citation_date = citation_date;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.defendant_address = defendant_address;
        this.defendant_city = defendant_city;
        this.defendant_state = defendant_state;
        this.drivers_license_number = drivers_license_number;
        this.court_date = court_date;
        this.court_location = court_location;
        this.court_address = court_address;
    }



    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("id", id)
                .add("citation_number", citation_number)
                .add("citation_date", citation_date)
                .add("citation_date", citation_date)
                .add("first_name", first_name)
                .add("last_name", last_name)
                .add("date_of_birth", date_of_birth)
                .add("defendant_address", defendant_address)
                .add("defendant_city", defendant_city)
                .add("defendant_state", defendant_state)
                .add("drivers_license_number", drivers_license_number)
                .add("court_date", court_date)
                .add("court_location", court_location)
                .add("court_address", court_address)
                .toString();
    }
}
