package com.beanpackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mymain {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get the bean using context
		Empojo em=(Empojo) context.getBean("hello",Empojo.class);
		System.out.println(em.helloWorld());
				
		context.close();
	}

}
