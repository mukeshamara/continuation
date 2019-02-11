package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
      ApplicationContext ac=new ClassPathXmlApplicationContext("app.xml");      
      Employee emp=(Employee)ac.getBean("e");
      emp.show();      
      Employee1 emp1=(Employee1)ac.getBean("ee");
      emp1.show();       
      
	}
}
