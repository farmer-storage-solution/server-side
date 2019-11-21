package com.storage.solutions.StorageSolution.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Owner")
public class Owner extends User {
}
