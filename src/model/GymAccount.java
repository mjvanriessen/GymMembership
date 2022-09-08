/**
 * Michael Van Riessen - mjvanriessen
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
package model;


public class GymAccount {
	
	private String location;
	private String memberTier;
	private double balanceDue;
	
	public GymAccount(Client client, String location, String memberTier) {
		setLocation(location);
		setMemberTier(memberTier);
		setBalanceDue(0.0);
	}
	
	public GymAccount(Client client) {
	}
	
	public GymAccount() {
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMemberTier() {
		return memberTier;
	}

	public void setMemberTier(String memberTier) {
		this.memberTier = memberTier;
	}

	public double getBalanceDue() {
		return balanceDue;
	}

	public void setBalanceDue(double balanceDue) {
		this.balanceDue = balanceDue;
	}
	
	public void tierPayment() {
		if (getMemberTier().equalsIgnoreCase("Student")) {
			setBalanceDue(75.00);
		}
		else if (getMemberTier().equalsIgnoreCase("Standard")) {
			setBalanceDue(90.00);
		}
		else if (getMemberTier().equalsIgnoreCase("Premium")) {
			setBalanceDue(115.00);
		}
		else {
			setBalanceDue(0.00);
		}
	}
	
	public void taxedBalance() {
		double finalBalance = getBalanceDue() + (getBalanceDue() * 0.06);
		setBalanceDue(finalBalance);
	}
	
	public boolean adultSignature(Client client) {
		if (client.getAge() >= 18) {
			return true;
		}
		else {
			return false;
		}
	}

}
