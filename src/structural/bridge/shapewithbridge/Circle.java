package structural.bridge.shapewithbridge;

public class Circle extends Shape {

	Circle(Color color) {
		super(color);
	}
	
	@Override
	public void applyColor() {
		color.applyColor();
	}

}
