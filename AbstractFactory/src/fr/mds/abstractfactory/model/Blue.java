package fr.mds.abstractfactory.model;

public class Blue implements Color {

	public static final String BLUE = "Blue";

	@Override
	public void fill() {
		System.out.println("It's blue.");
	}

}
