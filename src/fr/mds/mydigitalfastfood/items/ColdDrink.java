package fr.mds.mydigitalfastfood.items;

import fr.mds.mydigitalfastfood.Item;
import fr.mds.mydigitalfastfood.items.Packing;

public abstract class ColdDrink implements Item {

	abstract public String name();

	abstract public float price();
	
	abstract public Packing packing();

}
