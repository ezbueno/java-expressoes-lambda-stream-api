package com.buenoezandro.lambdastream.exemplo04;

import java.util.List;

/**
 * @author Ezandro Bueno
 * Stream API em coleções de objetos
 */

public class Exemplo04 {

	public static void main(String[] args) {
		List<Car> cars = List.of(new Car("BMW", 120000), new Car("Renault", 85000), new Car("VW", 70000));

		cars.stream()
			.sorted((c1, c2) -> Double.valueOf(c1.getPrice()).compareTo(c2.getPrice()))
			.map(c -> new Car(c.getBrand().toLowerCase(), c.getPrice()))
			.peek(Car::addTax)
			.forEach(System.out::println);
	}
}
