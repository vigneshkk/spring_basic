package com.lookup.ByInterface;

class Car {
  public Engine myCarengine() {
	  Engine e=new Engine();
	  e.setName("Audi8");
	  return e;
  };
  public void mycarName() {
	  System.out.println("Lamborghini");
  }
}
