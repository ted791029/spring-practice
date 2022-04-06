package com.ted.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean-di.xml");
		Student s1 = ac.getBean("s1", Student.class);
		System.out.println(s1);
		Student s2 = ac.getBean("s2", Student.class);
		System.out.println(s2);
		Student s3 = ac.getBean("s3", Student.class);
		System.out.println(s3);
		Student s4 = ac.getBean("s4", Student.class);
		System.out.println(s4);
		Student s5 = ac.getBean("s5", Student.class);
		System.out.println(s5);
		Teacher t2 = ac.getBean("t2", Teacher.class);
		System.out.println(t2);
		Teacher t3 = ac.getBean("t3", Teacher.class);
		System.out.println(t3);
		Teacher t4 = ac.getBean("t4", Teacher.class);
		System.out.println(t4);
	}
}
