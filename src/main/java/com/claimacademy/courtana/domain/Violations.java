package com.claimacademy.courtana.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.google.common.base.Objects;



@Entity
@Table(name="violations")
public class Violations {

	@NotNull
	@Column(name="id")
	int id;
	
	@NotNull
	@Size(max = 11)
	@Column(name="citation_number", nullable = false)
	int citation_number;
	
	@NotNull
	@Size(max = 250)
	@Column(name="violation_number")
	String violation_number;
	
	@NotNull
	@Size(max = 250)
	@Column(name="violation_description")
	String violation_description;
	
	@NotNull
	@Size(max = 250)
	@Column(name="warrant_status")
	String warrant_status;
	
	@Size(max = 250)
	@Column(name="warrant_number")
	String warrant_number;
	
	@NotNull
	@Size(max = 250)
	@Column(name="status")
	String status;
	
	@NotNull
	@Size(max = 250)
	@Column(name="status_update")
	String status_update;
	
	@Size(max = 250)
	@Column(name="fine_amount")
	String fine_amount;
	
	@Size(max = 250)
	@Column(name="court_cost")
	String court_cost;
	
	public Violations(){
		
	}

	public Violations(int id, int citation_number, String violation_number, String violation_description,
			String warrant_status, String warrant_number, String status, String status_update, String fine_amount,
			String court_cost) {
		super();
		this.id = id;
		this.citation_number = citation_number;
		this.violation_number = violation_number;
		this.violation_description = violation_description;
		this.warrant_status = warrant_status;
		this.warrant_number = warrant_number;
		this.status = status;
		this.status_update = status_update;
		this.fine_amount = fine_amount;
		this.court_cost = court_cost;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this)
				.add("id", id)
				.add("citation_number", citation_number)
				.add("violation_number", violation_number)
				.add("violation_description", violation_description)
				.add("warrant_status", warrant_status)
				.add("warrant_number", warrant_number)
				.add("status", status)
				.add("status_update", status_update)
				.add("fine_amount", fine_amount)
				.add("court_cost", court_cost)
				.toString();
				
	}

	
	
	
}
