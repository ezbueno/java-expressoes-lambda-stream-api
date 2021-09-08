package com.buenoezandro.lambdastream.exemplo07;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ezandro Bueno
 * Operação de reduction em uma stream
 */

public class Exemplo07 {

	public static void main(String[] args) {
		int[] array = List.of(3, 2, 5, 2, 9).stream().mapToInt(Integer::intValue).toArray();
		System.out.println("Resultado da multiplicação: " + multiply(array));
		System.out.println("Maior número: " + max(array));
	}

	private static int multiply(int[] array) {
		return Arrays.stream(array).reduce((x, y) -> x * y).orElse(0);
	}

	private static int max(int[] array) {
		return Arrays.stream(array).reduce((x, y) -> x > y ? x : y).orElse(0);
	}
}
