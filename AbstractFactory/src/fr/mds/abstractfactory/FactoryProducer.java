package fr.mds.abstractfactory;

import fr.mds.abstractfactory.factory.ColorFactory;
import fr.mds.abstractfactory.factory.ShapeFactory;

public class FactoryProducer {

	public static final String SHAPE = "Shape";
	public static final String COLOR = "Color";

	protected static AbstractFactory getFactory(String factory) {
		if (factory == SHAPE) {
            return new ShapeFactory();
        }
		else if (factory == COLOR) {
            return new ColorFactory();
        }
 
        return null;
	}

}
