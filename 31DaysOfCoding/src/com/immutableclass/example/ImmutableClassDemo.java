package com.immutableclass.example;

public final class ImmutableClassDemo {
	
	private final String address;
	
	public ImmutableClassDemo(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
}
