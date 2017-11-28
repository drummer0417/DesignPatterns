package nl.androidappfactory.designpatterns.facade;

public class ShapeApp {

	public static void main(String[] args) {

		ShapeMaker sm = new ShapeMaker();

		sm.drawCircle();
		sm.drawRectangle();
		sm.drawSquare();
	}
}
