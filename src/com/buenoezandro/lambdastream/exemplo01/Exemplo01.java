package com.buenoezandro.lambdastream.exemplo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ezandro Bueno
 * Expressão Lambda - Imprime os números da lista em ordem crescente
 */
public class Exemplo01 {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>(List.of(5, 3, 4, 1, 2));

		numbers.sort((n1, n2) -> n1.compareTo(n2));
		System.out.println(numbers);
	}
}
