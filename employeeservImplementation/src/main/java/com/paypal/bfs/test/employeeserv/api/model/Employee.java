package com.paypal.bfs.test.employeeserv.api.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Table(name = "employee")
@ToString
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "DOB")
	private String dateOfBirth;

	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)  
	@JoinColumn(name = "address_id", referencedColumnName = "Id")
	private Address address;  
}