package com.captain;

public class CaptainFactory {
	private int totalCaptains = 0;
	
	public int getTotalCaptains() {
		return totalCaptains;
	}
	
	public Captain getOli() {
		totalCaptains++;
		return new Captain(totalCaptains, 0);
	}
}
