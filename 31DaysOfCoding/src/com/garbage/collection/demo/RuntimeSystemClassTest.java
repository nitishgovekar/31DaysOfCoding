package com.garbage.collection.demo;

public class RuntimeSystemClassTest {

	public static void main(String[] args) {

		RuntimeSystemClassTest test = new RuntimeSystemClassTest();
		try {
			test = new RuntimeSystemClassTest();
			
		}catch(Exception e) {
			
		}
		/**
		  catch(ArithmeticException e ) {
		 If we have this catch block it will throw error as parent catch block already covers this exception
			
		}*/
		
		Runtime.getRuntime().gc();
	}
	
}
