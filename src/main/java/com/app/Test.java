package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
private static ApplicationContext ac;

public static void main(String[] args) {
	ac = new ClassPathXmlApplicationContext("config.xml");
	Employee e=(Employee)ac.getBean("emp");
	System.out.println(e);
}
}
