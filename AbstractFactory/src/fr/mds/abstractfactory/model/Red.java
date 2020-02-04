package fr.mds.abstractfactory.model;

public class Red implements Color {

	public static final String RED = "Red";

	@Override
	public void fill() {
		System.out.println("It's red.");
	}

}
