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
		if (shape.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
		else if (shape.equalsIgnoreCase("Square")) {
            return new Square();
        }
		else if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
 
        return null;
	}

}
