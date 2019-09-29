package Creational.protoype;

public abstract class Item implements Cloneable {
	private String title;
	private double price;
	private String url;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
