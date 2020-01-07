package fr.mds.mydigitalfastfood;

import fr.mds.mydigitalfastfood.items.Packing;

public interface Item {

	public abstract String name();
	public abstract Packing packing();
	public abstract float price();

}
