package fr.mds.mydigitalfastfood.items;

public class Coke extends ColdDrink {

	private String name;
	private float price;
	private Packing packing;

	public Coke() {
		this("Coke", 5F, new Bottle());
	}

	public Coke(String name, float price, Packing packing) {
		this.name = name;
		this.price = price;
		this.packing = packing;
	}

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public float price() {
		return this.price;
	}

	@Override
	public Packing packing() {
		return this.packing;
	}

}
