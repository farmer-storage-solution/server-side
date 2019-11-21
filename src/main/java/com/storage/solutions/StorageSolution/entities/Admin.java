package com.storage.solutions.StorageSolution.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Admin")
public class Admin extends  User{

    private Inventory inventory;

}
