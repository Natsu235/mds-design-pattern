package fr.mds.abstractfactory.model;

public class Square implements Shape {

	public static final String SQUARE = "Square";

	@Override
	public void draw() {
		System.out.println("It's a square.");
	}

}
