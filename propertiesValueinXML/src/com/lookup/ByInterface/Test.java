package com.lookup.ByInterface;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
public static void main(String[] args) {
	ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Mytestclassd ob=(Mytestclassd)context.getBean("my");
	ob.printing();
	 context.close();
}
}
