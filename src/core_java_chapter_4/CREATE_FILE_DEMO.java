/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_java_chapter_4;

/**
 *
 * @author itsvi
 */
// Import the File class
import java.io.File;

// Import the IOException class to handle errors
import java.io.IOException;

public class CREATE_FILE_DEMO {
	public static void main(String[] args)
	{

		try {
			File Obj = new File("myfile.txt");
			if (Obj.createNewFile()) {
				System.out.println("File created: "
								+ Obj.getName());
			}
			else {
				System.out.println("File already exists.");
			}
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}
	}
}
