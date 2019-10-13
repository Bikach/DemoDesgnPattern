package structural.bridge.shape2;

public abstract class Shape {

	protected Color color;
	
	Shape(Color color) {
		this.color = color;
	}
	
	abstract public void applyColor();
}
