package com.example;

public class Address {
private String city;
private String state;
public Address(String city, String state) {
	super();
	this.city = city;
	this.state = state;
}
@Override
public String toString() {
	return "City : " + city + "\nState : " + state;
}
}
