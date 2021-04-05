package com.ByProgram;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Lifecycleclass implements InitializingBean, DisposableBean {

	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method");
	}

	
	public void destroy() throws Exception {
		System.out.println("destroy method");
	}
}
