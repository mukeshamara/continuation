package com.example;
public class Employee {
	private int age;
	private String name;
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}

public void show()
{
	System.out.println("Hello "+name+"\nAge : "+age);
}
}
