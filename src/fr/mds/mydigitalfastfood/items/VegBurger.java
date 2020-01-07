package fr.mds.mydigitalfastfood.items;

public class VegBurger extends Burger {

	private String name;
	private float price;
	private Packing packing;

	public VegBurger() {
		this("Veggie Burger", 8.5F, new Wrapper());
	}

	public VegBurger(String name, float price, Packing packing) {
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
