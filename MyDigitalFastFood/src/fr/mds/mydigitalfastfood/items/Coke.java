package fr.mds.mydigitalfastfood.items;

public class Coke extends ColdDrink {

	private String name;
	private float price;
	private Bottle bottle;

	public Coke() {
		this("Coke Drink", 5F, new Bottle());
	}

	public Coke(String name, float price, Bottle bottle) {
		this.name = name;
		this.price = price;
		this.bottle = bottle;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getPrice() {
		return this.price;
	}

	@Override
	public Packing getPacking() {
		return this.bottle;
	}

}
