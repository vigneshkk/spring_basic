package com.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Singleton s=(Singleton) context.getBean("myId");
	Singleton s1=(Singleton) context.getBean("myId");
	if(s==s1) {
		System.out.println("true");
	}
}
}
