package fr.mds.abstractfactory.model;

public class Rectangle implements Shape {

	public static final String RECTANGLE = "RECTANGLE";

	@Override
	public void draw() {
		System.out.println("It's a rectangle.");
	}

}
