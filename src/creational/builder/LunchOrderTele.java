package creational.builder;

class LunchOrderTele {

	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	private LunchOrderTele(String bread) {
		this.bread = bread;	
	}
	
	private LunchOrderTele(String bread, String condiments) {
		this(bread);
		this.condiments = condiments;
	}
	
	private LunchOrderTele(String bread, String condiments, String dressing) {
		this(bread, condiments);
		this.dressing = dressing;
	}
	
	LunchOrderTele(String bread, String condiments, String dressing, String meat) {
		this(bread, condiments, dressing);
		this.meat = meat;
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
}
