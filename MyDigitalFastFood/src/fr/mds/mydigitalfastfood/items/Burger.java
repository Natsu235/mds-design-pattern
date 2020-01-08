package fr.mds.mydigitalfastfood.items;

import fr.mds.mydigitalfastfood.Item;

public abstract class Burger implements Item {

	abstract public String getName();
	abstract public float getPrice();
	abstract public Packing getPacking();

}
