package structural.bridge.shape2;

public class Square extends Shape {

	Square(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		color.applyColor();
	}

}
