package com.Main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.model.Employee;
import com.service.EmployeeDAO;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("app.xml");
        final Employee emp=new Employee(1,"Janu","Chennai");
		EmployeeDAO dao=(EmployeeDAO)context.getBean("edao");
		boolean status=dao.saveEmployee1(emp);
        if(status==true)
        	System.out.println("Record inserted successfully");
        else
        	System.out.println("Insertion failed");
        List<Employee> l=dao.show();
        for(Employee x:l)
        	System.out.println(x.getEmpno()+" "+x.getName()+" "+x.getAddress());
	}
}
