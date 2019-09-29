package Creational.builder;

public class LunchOrderBean {

	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	LunchOrderBean() {
		
	}
	
	String getBread() {
		return bread;
	}

	String getCondiments() {
		return condiments;
	}

	String getDressing() {
		return dressing;
	}

	String getMeat() {
		return meat;
	}

	public void setBread(String bread) {
		this.bread = bread;
	}

	public void setCondiments(String condiments) {
		this.condiments = condiments;
	}

	public void setDressing(String dressing) {
		this.dressing = dressing;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}
}
