package structural.facade;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class JdbcFacade {

	private DbSingleton instance = null;
	
	JdbcFacade() {
		instance = DbSingleton.getInstance();
	}
	
	int createTable() {
		int count = 0;
		try {
			Connection conn = instance.getConnection();
			Statement sta = conn.createStatement();
			count = sta.executeUpdate("CREATE TABLE Address (ID INTEGER, StreetName VARCHAR(20), City VARCHAR(20))");
			sta.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	int insertIntoTable() {
		int count = 0;
		try {
			Connection conn = instance.getConnection();
			Statement sta = conn.createStatement();
			count = sta.executeUpdate("INSERT INTO Address (ID, StreetName, City) values (1, '1234 Some street', 'Layton')");
			sta.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	List<Address> getAddresses() {
		List<Address> addresses = new ArrayList<>();
		
		try {
			Connection conn = instance.getConnection();
			Statement sta = conn.createStatement();
			ResultSet rs = sta.executeQuery("SELECT * FROM Address");
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
				Address address = new Address();
				address.setId(rs.getString(1));
				address.setStreetName(rs.getString(2));
				address.setCity(rs.getString(3));
				
				addresses.add(address);
			}
			
			rs.close();
			sta.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	

		return addresses;
	}	
}

class Address {
	private String id;
	private String streetName;
	private String city;
	
	String getId() {
		return id;
	}
	void setId(String id) {
		this.id = id;
	}
	String getStreetName() {
		return streetName;
	}
	void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	String getCity() {
		return city;
	}
	void setCity(String city) {
		this.city = city;
	}
	
	

}
