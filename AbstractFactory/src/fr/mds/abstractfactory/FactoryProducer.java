package fr.mds.abstractfactory;

import fr.mds.abstractfactory.factory.ColorFactory;
import fr.mds.abstractfactory.factory.ShapeFactory;

public class FactoryProducer {

	protected static AbstractFactory getFactory(String factory) {
		switch (factory) {
		    case "Shape":
		    	return new ShapeFactory();
		    case "Color":
		    	return new ColorFactory();
		    default:
		    	return null;
		}
	}

}
