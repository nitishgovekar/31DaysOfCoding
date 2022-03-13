package com.designpattern.examples;

public class SingletonLazyInitialization {

	private static SingletonLazyInitialization  instance = null;

	private SingletonLazyInitialization() {

	}

	private static SingletonLazyInitialization getInstance() {
		if(instance == null) {
			instance = new SingletonLazyInitialization();
		}
		return instance;
	}

}
