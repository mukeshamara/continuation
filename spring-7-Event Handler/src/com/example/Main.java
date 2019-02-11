package com.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("app.xml");
        Employee emp=(Employee)context.getBean("ee");
		context.start();
        emp.show();
        context.refresh();
		context.stop();
	}
}
