package com.klinnovations.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
	private Integer personId;
	private String personName;
	private String gender;
	private long phno;
	private Date dob;

}
