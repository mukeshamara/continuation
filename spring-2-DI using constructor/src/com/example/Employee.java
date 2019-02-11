package com.example;

import java.util.List;

public class Employee {
	private int age;
	private String name;
	private List<String> movie;
	private Address address;

public Employee(int age, String name, List<String> movie, Address address) {
		super();
		this.age = age;
		this.name = name;
		this.movie = movie;
		this.address = address;
	}

public void show()
{
	System.out.println("Hello "+name+"\nAge : "+age);
	for(String x:movie)
		System.out.println(x);
	System.out.println(address.toString());
}
}
