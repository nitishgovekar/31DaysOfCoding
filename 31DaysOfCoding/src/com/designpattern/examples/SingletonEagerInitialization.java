package com.designpattern.examples;

public class SingletonEagerInitialization {
	
private static SingletonEagerInitialization uniqueInstance = new SingletonEagerInitialization();

// As constructor is declared private we cannot instantiate the object from another class

private SingletonEagerInitialization() {}

private static SingletonEagerInitialization getInstance() {
	return uniqueInstance;
}

}
