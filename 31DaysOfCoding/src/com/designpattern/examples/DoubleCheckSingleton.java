package com.designpattern.examples;

public class DoubleCheckSingleton {

	private static DoubleCheckSingleton instance =  null;
	
	
	private DoubleCheckSingleton() {
		
	}
	
	private static DoubleCheckSingleton getInstance() {
		
		if(instance == null) {
			synchronized (DoubleCheckSingleton.class) {
				if(instance == null) {
					instance  = new DoubleCheckSingleton();
				}
				
			}
		}
		return instance;
	}
	
	
	
}
