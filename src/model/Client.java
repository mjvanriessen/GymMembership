/**
 * Michael Van Riessen - mjvanriessen
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
package model;


public class Client {
	
	private String fName;
	private String lName;
	private int age;
	private String phoneNumber;
	
	public Client(String fName, String lName, int age, String phoneNumber) {
		setfName(fName);
		setlName(lName);
		setAge(age);
		setPhoneNumber(phoneNumber);
	}
	
	public Client() {
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
