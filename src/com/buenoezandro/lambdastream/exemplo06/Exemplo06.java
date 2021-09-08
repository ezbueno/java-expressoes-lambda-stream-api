package com.buenoezandro.lambdastream.exemplo06;

import java.util.stream.IntStream;

/**
 * @author Ezandro Bueno
 * Closure em expressões lambda
 */

public class Exemplo06 {

	public static void main(String[] args) {
		final int mult = 2;

		IntStream.range(1, 21).map(i -> i * mult).forEach(System.out::println);
	}
}
