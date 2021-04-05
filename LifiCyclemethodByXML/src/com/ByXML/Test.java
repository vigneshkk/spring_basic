package com.ByXML;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
public static void main(String[] args) {
	ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	Lifecycleclass l=(Lifecycleclass) context.getBean("myId");
	Lifecycleclass1 l1=(Lifecycleclass1) context.getBean("my");
	 context.close();
}
}
