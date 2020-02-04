package fr.mds.abstractfactory;

import fr.mds.abstractfactory.factory.ColorFactory;
import fr.mds.abstractfactory.factory.ShapeFactory;
import fr.mds.abstractfactory.model.Blue;
import fr.mds.abstractfactory.model.Circle;
import fr.mds.abstractfactory.model.Color;
import fr.mds.abstractfactory.model.Green;
import fr.mds.abstractfactory.model.Rectangle;
import fr.mds.abstractfactory.model.Red;
import fr.mds.abstractfactory.model.Shape;
import fr.mds.abstractfactory.model.Square;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		// Get Shape Factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory(ShapeFactory.SHAPE);
		
		// Get an Object of Shape Circle
		Shape shape1 = shapeFactory.getShape(Circle.CIRCLE);
		
		// Call Draw Method of Shape Circle
		shape1.draw();
		
		// Get an Object of Shape Rectangle
		Shape shape2 = shapeFactory.getShape(Rectangle.RECTANGLE);
		
		// Call Draw Method of Shape Rectangle
		shape2.draw();
		
		// Get an Object of Shape Square
		Shape shape3 = shapeFactory.getShape(Square.SQUARE);
		
		// Call Draw Method of Shape Square
		shape3.draw();
		
		// Get Color Factory
		AbstractFactory colorFactory = FactoryProducer.getFactory(ColorFactory.COLOR);
		
		// Get an Object of Color Red
		Color color1 = colorFactory.getColor(Red.RED);
		
		// Call Fill Method of Red
		color1.fill();
		
		// Get an Object of Color Green
		Color color2 = colorFactory.getColor(Green.GREEN);
		
		// Call Fill Method of Green
		color2.fill();
		
		// Get an Object of Color Blue
		Color color3 = colorFactory.getColor(Blue.BLUE);
		
		// Call Fill Method of Color Blue
		color3.fill();
		
		// Get an Object of Shape Circle
		Shape myShape = FactoryProducer.getFactory(ShapeFactory.SHAPE).getShape(Circle.CIRCLE);
		
		// Call Draw Method of Shape Circle
		myShape.draw();
	}
}
