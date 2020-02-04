package fr.mds.abstractfactory.model;

public class Circle implements Shape {

	public static final String CIRCLE = "Circle";

	@Override
	public void draw() {
		System.out.println("It's a circle.");
	}

}
