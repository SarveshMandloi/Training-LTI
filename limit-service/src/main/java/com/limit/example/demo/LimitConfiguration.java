package com.limit.example.demo;

//import org.springframework.beans.factory.annotation.Value;

public class LimitConfiguration {

	//@Value("${limit-service.maximum}")
	private int maximum;
	
	//@Value("${limit-service.minimum}")
	private int minimum;
	
	public LimitConfiguration() {
		super();
	}

	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}


	
	 
}
