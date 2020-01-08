package fr.mds.mydigitalfastfood.items;

public class DrawGame extends Game {

	private String name;
	private float price;
	private GameBag gameBag;

	public DrawGame() {
		this("Drawing Game", 0F, new GameBag());
	}

	public DrawGame(String name, float price, GameBag gameBag) {
		this.name = name;
		this.price = price;
		this.gameBag = gameBag;
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
		return this.gameBag;
	}

}
