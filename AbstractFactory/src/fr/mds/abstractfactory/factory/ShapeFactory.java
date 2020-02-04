package fr.mds.abstractfactory.factory;

import fr.mds.abstractfactory.AbstractFactory;
import fr.mds.abstractfactory.model.Circle;
import fr.mds.abstractfactory.model.Rectangle;
import fr.mds.abstractfactory.model.Shape;
import fr.mds.abstractfactory.model.Square;

public class ShapeFactory extends AbstractFactory {

	public static final String SHAPE = "Shape";

	@Override
	protected Shape getShape(String shape) {
		switch (shape) {
		    case "Circle":
		    	return new Circle();
		    case "Square":
		    	return new Square();
		    case "Rectangle":
		    	return new Rectangle();
		    default:
		    	return null;
		}
	}

}
