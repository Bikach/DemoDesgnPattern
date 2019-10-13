package structural.bridge;

class Movie {

	private String classification;
	private String runtime;
	private String title;
	private String year;

	String getClassification() {
		return classification;
	}
	String getRuntime() {
		return runtime;
	}

	String getTitle() {
		return title;
	}

	String getYear() {
		return year;
	}

	void setClassification(String classification) {
		this.classification = classification;
	}

	void setRuntime(String runtime) {
		this.runtime = runtime;
	}

	void setTitle(String title) {
		this.title = title;
	}

	void setYear(String year) {
		this.year = year;
	}
}
