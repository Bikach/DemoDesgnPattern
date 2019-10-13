package structural.bridge;

class Detail {
	private String label;
	private String value;

	Detail(String label, String value) {
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