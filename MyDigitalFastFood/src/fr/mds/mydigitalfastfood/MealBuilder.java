package fr.mds.mydigitalfastfood;

import java.util.ArrayList;

import fr.mds.mydigitalfastfood.items.CarGame;
import fr.mds.mydigitalfastfood.items.ChickenBurger;
import fr.mds.mydigitalfastfood.items.Coke;
import fr.mds.mydigitalfastfood.items.DrawGame;
import fr.mds.mydigitalfastfood.items.Pepsi;
import fr.mds.mydigitalfastfood.items.VegBurger;

public class MealBuilder {

    protected ArrayList<Item> items = new ArrayList<Item>();

	// Créer un menu végétarien
	public MealBuilder prepareVegMeal() {
		items.add(new VegBurger());
		items.add(new Pepsi());
		return this;
	}

	// Créer un menu non-végétarien
	public MealBuilder prepareNonVegMeal() {
		items.add(new ChickenBurger());
		items.add(new Coke());
		return this;
	}

	// Créer un menu enfant
	public MealBuilder prepareHappyMeal() {
		items.add(new ChickenBurger());
		items.add(new Pepsi());
		if (Math.random() < 0.5) {
		    items.add(new CarGame());
		}
		else {
			items.add(new DrawGame());
		}
		return this;
	}

	// Génère la commande choisie
	public Meal build() {
		final Meal result = new Meal();
		result.setItems(this.items);
		return result;
	}

}
