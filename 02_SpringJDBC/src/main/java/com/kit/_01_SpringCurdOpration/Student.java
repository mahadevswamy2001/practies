package com.kit._01_SpringCurdOpration;

public class Student {
	private String Usn;
	private String Name;
	private String City;

	// Getters and Setters

	@Override
	public String toString() {
		return "Student [Usn=" + Usn + ", Name=" + Name + ", City=" + City + "]";
	}

	public String getUsn() {
		return Usn;
	}

	public void setUsn(String usn) {
		Usn = usn;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}
}
