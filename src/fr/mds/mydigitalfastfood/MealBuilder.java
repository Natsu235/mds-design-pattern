package fr.mds.mydigitalfastfood;

import java.util.ArrayList;

import fr.mds.mydigitalfastfood.items.ChickenBurger;
import fr.mds.mydigitalfastfood.items.Coke;
import fr.mds.mydigitalfastfood.items.Pepsi;
import fr.mds.mydigitalfastfood.items.VegBurger;

public class MealBuilder {

    protected ArrayList<Item> items = new ArrayList<Item>();

	// Cr�er un menu v�g�tarien
	public MealBuilder prepareVegMeal() {
		items.add(new VegBurger());
		items.add(new Pepsi());
		return this;
	}

	// Cr�er un menu non-v�g�tarien
	public MealBuilder prepareNonVegMeal() {
		items.add(new ChickenBurger());
		items.add(new Coke());
		return this;
	}

	// G�n�re la commande
	public Meal build() {
		final Meal result = new Meal();
		result.setItems(this.items);
		items = new ArrayList<Item>();
		return result;
	}

}
