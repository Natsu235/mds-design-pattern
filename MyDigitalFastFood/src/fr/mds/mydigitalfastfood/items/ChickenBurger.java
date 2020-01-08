package fr.mds.mydigitalfastfood.items;

public class ChickenBurger extends Burger {

	private String name;
	private float price;
	private Wrapper wrapper;

	public ChickenBurger() {
		this("Chicken Burger", 10F, new Wrapper());
	}

	public ChickenBurger(String name, float price, Wrapper wrapper) {
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
