package com.storage.solutions.StorageSolution.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Staff")
public class Staff extends User  {
	
}
