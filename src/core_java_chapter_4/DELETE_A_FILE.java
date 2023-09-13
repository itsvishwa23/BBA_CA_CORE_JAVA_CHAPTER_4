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

public class DELETE_A_FILE {
	public static void main(String[] args)
	{
		File Obj = new File("myfile.txt");
		if (Obj.delete()) {
			System.out.println("The deleted file is : "
							+ Obj.getName());
		}
		else {
			System.out.println(
				"Failed in deleting the file.");
		}
	}
}
