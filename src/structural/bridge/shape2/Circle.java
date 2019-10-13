package structural.bridge.shape2;

public class Circle extends Shape {

	Circle(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		color.applyColor();
	}

}
