package fr.mds.abstractfactory;

import fr.mds.abstractfactory.model.Color;
import fr.mds.abstractfactory.model.Shape;

public abstract class AbstractFactory {

	protected Shape getShape(String shape) {
		return null;
	}

	protected Color getColor(String color) {
		return null;
	}

}
