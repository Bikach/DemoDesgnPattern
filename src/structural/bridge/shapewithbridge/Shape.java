package structural.bridge.shapewithbridge;

public abstract class Shape {

	protected Color color;
	
	Shape(Color color) {
		this.color = color;
	}
	
	abstract public void applyColor();
}
