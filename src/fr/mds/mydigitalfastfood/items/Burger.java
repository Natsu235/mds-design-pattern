package fr.mds.mydigitalfastfood.items;

import fr.mds.mydigitalfastfood.Item;

public abstract class Burger implements Item {

	abstract public String name();

	abstract public float price();
	
	abstract public Packing packing();

}
