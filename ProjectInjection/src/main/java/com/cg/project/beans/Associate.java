package com.cg.project.beans;

public class Associate {
private int associateId;
private String firstName,lastName;
private Address address;
public Associate(){}
public Associate(int associateId, String firstName, String lastName, Address address) {
	super();
	this.associateId = associateId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
}
@Override
public String toString() {
	return "Associate [associateId=" + associateId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
}
public int getAssociateId() {
	return associateId;
}
public void setAssociateId(int associateId) {
	this.associateId = associateId;
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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}

}
