package structural.adapter;

class EmployeeLdap {

	private String cn;
	private String surname;
	private String givenName;
	private String mail;
	
	EmployeeLdap(String cn, String surname, String givenName, String mail) {
		this.cn = cn;
		this.surname = surname;
		this.givenName = givenName;
		this.mail = mail;
	}
	
	String getCn() {
		return cn;
	}
	String getSurname() {
		return surname;
	}
	String getGivenName() {
		return givenName;
	}
	String getMail() {
		return mail;
	}
}
