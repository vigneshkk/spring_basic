package com.lookup.ByInterface;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
public static void main(String[] args) {
	ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	context.start();
	context.stop();
	 context.close();
}
}
