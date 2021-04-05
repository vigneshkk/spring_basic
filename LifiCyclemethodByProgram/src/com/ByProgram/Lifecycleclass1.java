package com.ByProgram;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Lifecycleclass1 implements InitializingBean, DisposableBean {

	public void afterPropertiesSet() throws Exception {
		System.out.println("Init1 method");
	}

	
	public void destroy() throws Exception {
		System.out.println("destroy1 method");
	}
}