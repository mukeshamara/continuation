package com.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("app.xml");
        Employee emp=(Employee)ac.getBean("employee");
        emp.show();
        ((AbstractApplicationContext) ac).registerShutdownHook();
	}
}
