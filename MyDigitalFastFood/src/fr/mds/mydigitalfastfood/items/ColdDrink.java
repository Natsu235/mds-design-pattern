package fr.mds.mydigitalfastfood.items;

import fr.mds.mydigitalfastfood.Item;
import fr.mds.mydigitalfastfood.items.Packing;

public abstract class ColdDrink implements Item {

	abstract public String getName();
	abstract public float getPrice();
	abstract public Packing getPacking();

}
