package com.gop.expertec.entity;

import java.util.Date;
import java.util.List;

public class Person {
	private String lastName;
	private String firstName;
	private Date birthDate;
	private List<Person> children;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fisrtName) {
		this.firstName = fisrtName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName
				+ ", birthDate=" + birthDate + ", children=" + children + "]";
	}
	public List<Person> getChildren() {
		return children;
	}
	public void setChildren(List<Person> children) {
		this.children = children;
	}
}
