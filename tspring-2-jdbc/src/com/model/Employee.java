package com.model;

public class Employee {
private Integer empno;
private String name;
private String address;
public Employee(Integer empno, String name, String address) {
	super();
	this.empno = empno;
	this.name = name;
	this.address = address;
}
public Integer getEmpno() {
	return empno;
}
public void setEmpno(Integer empno) {
	this.empno = empno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}


}
