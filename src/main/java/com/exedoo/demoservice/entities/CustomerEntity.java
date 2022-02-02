package com.exedoo.demoservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class CustomerEntity {	
	@Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column
	String name;
	
	@Column
	String address;
	
	@Column
	String telephone;
	@Column @JsonIgnore
	String secret;
	
	@OneToOne
	CityEntity city;
}
