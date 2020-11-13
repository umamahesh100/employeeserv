package com.paypal.bfs.test.employeeserv.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "address")
@ToString
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	@Getter @Setter private Integer id;

	@Column(name = "lineOne")
	@Getter @Setter private String lineOne;
	
	@OneToOne(targetEntity=Employee.class)  
	private Employee employee; 
	
	@Column(name = "lineTwo")
	@Getter @Setter private String lineTwo;

	@Column(name = "city")
	@Getter @Setter private String city;

	@Column(name = "state")
	@Getter @Setter private String state;
	/**
	 * Country
	 * 
	 */
	@Column(name = "country")
	@Getter @Setter private String country;
	/**
	 * zip_code
	 * 
	 */
	@Column(name = "zipCode")
	@Getter @Setter private String zipCode;
}