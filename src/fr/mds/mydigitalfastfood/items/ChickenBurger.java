package fr.mds.mydigitalfastfood.items;

public class ChickenBurger extends Burger {

	private String name;
	private float price;
	private Packing packing;

	public ChickenBurger() {
		this("Chicken Burger", 10F, new Wrapper());
	}

	public ChickenBurger(String name, float price, Packing packing) {
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
