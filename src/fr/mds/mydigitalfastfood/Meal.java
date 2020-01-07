package fr.mds.mydigitalfastfood;

import java.util.ArrayList;

public class Meal {

	private String name;
	private float price;
	private ArrayList<Item> items;

	// Ajoute un élement au menu
	public void addItem(Item item) {
		items.add(item);
	}

	// Affiche la liste des élements du menu
	public void showItems() {
		for (Item item : items) {
			System.out.println("Item: " + item.name() + " | Price: " + item.price());
		}
	}

	// Affiche le prix total du menu
	public void getTotalCost() {
		for (Item item : items) {
			price = price + item.price();
		}
		System.out.println("Total Cost: " + price);
	}

	// Getters
	public String getName() { return name; }
	public float getCost() { return price; }
	public ArrayList<Item> getItems() { return items; }

	// Setters
	public void setName(String name) { this.name = name; }
	public void setCost(float price) { this.price = price; }
	public void setItems(ArrayList<Item> items) { this.items = items; }

}
