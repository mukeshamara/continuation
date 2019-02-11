package com.example;

import java.util.List;

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
    	System.out.println("Age : "+age+"Name : "+name);
    }
    public void init()
    {
    	System.out.println("Initializing the bean");
    }
    public void destroy()
    {
    	System.out.println("Destroying the bean");
    }
    
}
