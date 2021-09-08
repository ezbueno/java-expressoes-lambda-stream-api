package com.buenoezandro.lambdastream.exemplo03;

import java.util.List;

/**
 * @author Ezandro Bueno
 * Stream API aplicada em coleções do Java
 */

public class Exemplo03 {

	public static void main(String[] args) {
		List<String> names = List.of("CARLOS", "JOSÉ", "JOÃO", "JOANA", "MARIA", "CELSO");

		names.stream()
			.filter(n -> n.startsWith("J"))
			.map(String::toLowerCase)
			.forEach(System.out::println);
	}
}
