package com.buenoezandro.lambdastream.exemplo05;

import java.util.Map;
import java.util.Optional;

/**
 * @author Ezandro Bueno
 * Interface Optional
 */

public class Exemplo05 {

	private static final Map<String, Integer> PEOPLE = Map.of("Pedro", 15, "Maria", 20, "Paulo", 25, "Jorge", 10);

	public static void main(String[] args) {
		Optional<Integer> opt = get("Pedro");
		
		opt.ifPresentOrElse(
			i -> System.out.println("A idade '" + i + "' foi encontrada!!!"),
			() -> System.out.println("A idade não foi encontrada!!!")
		);
	}

	private static Optional<Integer> get(String name) {
		return Optional.ofNullable(PEOPLE.get(name));
	}
}
