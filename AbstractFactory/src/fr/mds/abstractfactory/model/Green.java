package fr.mds.abstractfactory.model;

public class Green implements Color {

	public static final String GREEN = "Green";

	@Override
	public void fill() {
		System.out.println("It's green.");
	}

}
