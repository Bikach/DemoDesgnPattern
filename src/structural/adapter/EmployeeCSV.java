package structural.adapter;

import java.util.StringTokenizer;

class EmployeeCSV {

	private int id;
	private String firstname;
	private String lastname;
	private String emailAddress;

	EmployeeCSV(String values) {
		StringTokenizer tokenizer = new StringTokenizer(values, ",");
		if (tokenizer.hasMoreElements()) {
			id = Integer.parseInt(tokenizer.nextToken());
		}
		if (tokenizer.hasMoreElements()) {
			firstname = tokenizer.nextToken();
		}
		if (tokenizer.hasMoreElements()) {
			lastname = tokenizer.nextToken();
		}
		if (tokenizer.hasMoreElements()) {
			emailAddress = tokenizer.nextToken();
		}
	}

	String getEmailAddress() {
		return emailAddress;
	}

	String getFirstname() {
		return firstname;
	}

	int getId() {
		return id;
	}

	String getLastname() {
		return lastname;
	}

}
