/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_java_chapter_4;

// Import the File class
import java.io.File;

// Import this class for handling errors
import java.io.FileNotFoundException;

// Import the Scanner class to read content from text files
import java.util.Scanner;

public class READ_FILE_DEMO{
	public static void main(String[] args)
	{
		try {
			File Obj = new File("E:\\SENIOR_COLLEGE_TEACHING_MATERIAL\\PPT\\JAVA\\Programs\\CORE_JAVA_CHAPTER_4\\src\\core_java_chapter_4\\myfile.txt");
			Scanner Reader = new Scanner(Obj);
			while (Reader.hasNextLine()) {
				String data = Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}
