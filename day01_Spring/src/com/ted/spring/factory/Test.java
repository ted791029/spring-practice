package com.ted.spring.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean-factory.xml");
		Object o1 = ac.getBean("f1");
		System.out.println(o1);
	}

}
