/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_java_chapter_4;

/**
 *
 * @author itsvi
 */
// Java Program to Illustrate BufferedReader Class
// Via Its Methods

// Importing required classes
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Class
class BUFFER_READER_DEMO {

	// Main driver method
	public static void main(String[] args)
		throws IOException
	{

		// Creating object of FileReader and BufferedReader
		// class
		FileReader fr = new FileReader("file.txt");
		BufferedReader br = new BufferedReader(fr);

		char c[] = new char[20];

		// Illustrating markSupported() method
		if (br.markSupported()) {

			// Print statement
			System.out.println(
				"mark() method is supported");

			// Illustrating mark method
			br.mark(100);
		}

		// File Contents is as follows:
		// This is first line
		// this is second line

		// Skipping 8 characters
		br.skip(8);

		// Illustrating ready() method
		if (br.ready()) {

			// Illustrating readLine() method
			System.out.println(br.readLine());

			// Illustrating read(char c[],int off,int len)
			br.read(c);

			for (int i = 0; i < 20; i++) {
				System.out.print(c[i]);
			}

			System.out.println();

			// Illustrating reset() method
			br.reset();
			for (int i = 0; i < 8; i++) {

				// Illustrating read() method
				System.out.print((char)br.read());
			}
		}
	}
}
