package com.training.demo;

class Smartphone {

	public boolean isOn;
	public int brightness;

	public void turnOn() {
		isOn = true;
		brightness = 100;
	}

	public void status() {
		System.out.println("Brightness Status " + (isOn ? "ON" : "OFF") + " at " + brightness + "%");
	}
}

public class Oops {
	public static void main(String[] args) {

		Smartphone phone = new Smartphone();

		phone.status();
		phone.turnOn();
		phone.status();
	}
}
