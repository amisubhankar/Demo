package com.springcoredemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App {
	//Demo of Dependency Injection
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Employee emp1 = (Employee) context.getBean("emp1");

		System.out.println(emp1);
		
		
		//Another way
		Resource res = new ClassPathResource("spring.xml");
		BeanFactory factory = new XmlBeanFactory(res);

		Employee emp2 = (Employee) context.getBean("emp2");

		System.out.println(emp2);
	}

}
