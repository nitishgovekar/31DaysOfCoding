package com.garbage.collection.demo;

public class SystemClassTest {
	   public static void main(String[] args){
	      SystemClassTest test = new SystemClassTest();
	      test = null;
	      System.gc();
	   }
	   public void finalize() {
	      System.out.println("Garbage collected");
	   }
	}