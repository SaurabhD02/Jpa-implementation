package com.spd.jpademo.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
	
	private long id;
	
	private String streetName;
	
	private String villageName;
	
	private int pinCode;
	
	private String district;
	
}
