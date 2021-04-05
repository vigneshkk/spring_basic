package com.singleton;

public class Singleton {
	
	public static Singleton single;

	private Singleton() {
		System.out.println("Singleton constructor");
	}
	public static  Object getInstance() {
		if(single==null) {
			single=new Singleton();
			return single;
		}else {
			return single;
		}
		
	}
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException();
	}
	
}
