package com.buenoezandro.lambdastream.exemplo08;

import java.util.stream.Collectors;

/**
 * @author Ezandro Bueno
 * Concatenação de strings
 */

public class Exemplo08 {
	
	public static void main(String[] args) {
		String str = "ACBA";
		
		String result = str.chars()
				.mapToObj(i -> String.valueOf(i - 64))
				.collect(Collectors.joining("-", "=>> ", " <<="));
		
		System.out.println(result);
	}

}
