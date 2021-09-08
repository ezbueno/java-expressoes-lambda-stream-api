package com.buenoezandro.lambdastream.exemplo04;

public class Car {

	private String brand;
	private double price;

	public Car() {
	}

	public Car(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public void addTax() {
		this.price += this.price * 0.1;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}

}
