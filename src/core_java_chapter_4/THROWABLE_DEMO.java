/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_java_chapter_4;

// Java program to demonstrate
// the getMessage() Method.

import java.io.*;

class THROWABLE_DEMO {

	// Main Method
	public static void main(String[] args)
		throws Exception
	{

		try {

			// Divide the numbers
			divide(2, 0);
		}

		catch (ArithmeticException e) {

			System.out.println(
				"Message String = "
				+ e.getMessage());
		}
	}

	// Method which divides two numbers
	public static void divide(int a, int b)
		throws ArithmeticException
	{

		int c = a / b;
		System.out.println("Result:" + c);
	}
}
