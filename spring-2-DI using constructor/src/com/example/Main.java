package com.example;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
public class Main {
	public static void main(String[] args) {
		
		ClassPathResource r=new ClassPathResource("applicationContext.xml");
		BeanFactory bf=new XmlBeanFactory(r);
		Employee emp1=(Employee)bf.getBean("e");
		emp1.show();
		
		/*
		 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp=(Employee) context.getBean("e");
	    emp.show();
	    */
	}
}
