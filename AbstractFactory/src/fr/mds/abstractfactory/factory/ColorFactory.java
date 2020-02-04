package fr.mds.abstractfactory.factory;

import fr.mds.abstractfactory.AbstractFactory;
import fr.mds.abstractfactory.model.Blue;
import fr.mds.abstractfactory.model.Color;
import fr.mds.abstractfactory.model.Green;
import fr.mds.abstractfactory.model.Red;

public class ColorFactory extends AbstractFactory {

	public static final String COLOR = "Color";

	@Override
	protected Color getColor(String color) {
		switch (color) {
		    case "Red":
		    	return new Red();
		    case "Green":
		    	return new Green();
		    case "Blue":
		    	return new Blue();
		    default:
		    	return null;
		}
	}

}
