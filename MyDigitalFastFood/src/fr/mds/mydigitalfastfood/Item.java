package fr.mds.mydigitalfastfood;

import fr.mds.mydigitalfastfood.items.Packing;

public interface Item {

	public abstract String getName();
	public abstract Packing getPacking();
	public abstract float getPrice();

}
