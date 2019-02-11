package com.example;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
public class Main {
	public static void main(String[] args) {
	   ClassPathResource r=new ClassPathResource("treemap.xml");
       BeanFactory bf=new XmlBeanFactory(r);
       Location l=(Location)bf.getBean("loc");
       l.showCountries();
	}
}

/*
 <property name="hm">
 </property>
*/