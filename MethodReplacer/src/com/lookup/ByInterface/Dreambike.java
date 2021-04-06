package com.lookup.ByInterface;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class Dreambike implements MethodReplacer {

	@Override
	public Object reimplement(Object o, Method arg1, Object[] arg2) throws Throwable {
		System.out.println("Yamaha R1");
		return o;
	}

}
