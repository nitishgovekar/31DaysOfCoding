package com.immutableclass.example;

public class TestImmutableClass {
	public static void main(String[] args) {
		ImmutableClassDemo demo = new ImmutableClassDemo("Katraj");
		System.out.println(demo.getAddress());
		
	}
}


/**
Immutable class means once the object is created we cannot change it's
content
Steps to make a class immutable:
Class must be declared final , so that child classes cannot be created
Data members should be declared private so that direct access is prohibited
Data members should be declared final so that we can't change it's value after object creation 
A parameterized constructor should initialize all the fields performing a deep copy so that data members can’t be modified with an object reference.

**/