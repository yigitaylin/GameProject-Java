package Entity;

import Abstract.IEntity;

public class Player implements IEntity{
	private int id;
	private String firstName;
	private String lastName;
	private int birthYear;
	private String tcNo;
	private double money;
	

	public Player(String firstName,String lastName,int birtYear,String tcNo) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.birthYear=birthYear;
		this.tcNo=tcNo;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	
	

}
