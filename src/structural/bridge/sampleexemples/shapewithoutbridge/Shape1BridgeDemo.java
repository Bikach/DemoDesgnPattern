package structural.bridge.sampleexemples.shapewithoutbridge;

public class Shape1BridgeDemo {

	public static void main(String args[]) {

		Circle circle = new BlueCircle();

		Square square = new RedSquare();
		
		Square greenSquare = new GreenSquare();

		circle.applyColor();
		square.applyColor();
		greenSquare.applyColor();
	}

}
