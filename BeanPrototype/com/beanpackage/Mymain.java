package com.beanpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mymain {

	public static void main(String[] args) {

		// load the spring configuration file
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Get the bean using context
		Empojo em=(Empojo) context.getBean("hello",Empojo.class);
		Empojo em1=(Empojo) context.getBean("hello",Empojo.class);
		Empojo em2=(Empojo) context.getBean("hello",Empojo.class);
		System.out.println(em.helloWorld());
				
		((AbstractApplicationContext) context).close();
	}

}
