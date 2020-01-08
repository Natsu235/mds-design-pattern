package fr.mds.mydigitalfastfood.items;

public class VegBurger extends Burger {

	private String name;
	private float price;
	private Wrapper wrapper;

	public VegBurger() {
		this("Veggie Burger", 8.5F, new Wrapper());
	}

	public VegBurger(String name, float price, Wrapper wrapper) {
		this.name = name;
		this.price = price;
		this.wrapper = wrapper;
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
		return this.wrapper;
	}

}
