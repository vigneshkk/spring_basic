package com.beanpackage;

public class Empojo {
	private String mystringVar;
	private String myLocation;


	public Empojo(String mystringVar,String myLocation) {
		this.mystringVar=mystringVar;
		this.myLocation=myLocation;
	}
//	public void setMystringVar(String mystringVar) {
//		this.mystringVar = mystringVar;
//	}
	
	public void  helloWorld() {
		System.out.println(this.mystringVar+"   "+this.myLocation);
	}

}
