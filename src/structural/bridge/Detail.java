package structural.bridge;

public class Detail {
	private String label;
	private String value;

	public Detail(String label, String value) {
		this.label = label;
		this.value = value;
	}

	String getLabel() {
		return label;
	}

	String getValue() {
		return value;
	}

}