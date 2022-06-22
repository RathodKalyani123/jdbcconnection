package JDBC;

public class Persons {
	private int PersonsID;
	private String LastName ;
	private String FirstName;
	private String Address ;
	private String City;
	public int getPersonsID() {
		return PersonsID;
	}
	public void setPersonsID(int personsID) {
		PersonsID = personsID;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Persons(int personsID, String lastName, String firstName, String address, String city) {
		
		PersonsID = personsID;
		LastName = lastName;
		FirstName = firstName;
		Address = address;
		City = city;
	}
	public Persons() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Persons [PersonsID=" + PersonsID + ", LastName=" + LastName + ", FirstName=" + FirstName + ", Address="
				+ Address + ", City=" + City + "]";
	}
	
	

}
