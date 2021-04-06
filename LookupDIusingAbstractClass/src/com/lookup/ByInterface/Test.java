package com.lookup.ByInterface;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
public static void main(String[] args) {
	ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Car c=(Car)context.getBean("c");
	System.out.println(c.myCarengine().getName());
	c.mycarName();
	 context.close();
}
}
