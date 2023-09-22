package com.test.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Book {
	@Id
	private int id;
	
	private String name;
	
	private double price;

}
