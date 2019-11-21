package com.storage.solutions.StorageSolution.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Farmer")
public class Farmer extends User {
	
	private Inventory inventoy;
	
}
