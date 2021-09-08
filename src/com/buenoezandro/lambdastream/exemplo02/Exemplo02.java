package com.buenoezandro.lambdastream.exemplo02;

/**
 * @author Ezandro Bueno
 * Interface funcional
 */

public class Exemplo02 {

	public static void main(String[] args) {
		Operator op = (x, y) -> x * y;
		System.out.println(op.execute(5, 2));
	}
}
