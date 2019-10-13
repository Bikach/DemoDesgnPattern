package structural.bridge.shapewithbridge;

public class Shape2BridgeDemo {

	public static void main(String[] args) {
		Color blue = new Blue();
		Shape blueSquare = new Square(blue);

		Color red = new Red();
		Shape redCircle = new Circle(red);
		
		Color green = new Green();
		Shape greenCircle = new Circle(green);
		Shape greenSquare = new Square(green);
		
		blueSquare.applyColor();
		redCircle.applyColor();
		greenCircle.applyColor();
		greenSquare.applyColor();
	}

}
