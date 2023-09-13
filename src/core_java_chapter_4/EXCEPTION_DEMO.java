/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_java_chapter_4;
 
public class EXCEPTION_DEMO {

	public static void main (String[] args) {
	int a=5;
	int b=0;
		try{
		System.out.println(a/b);
		}
	catch(ArithmeticException e){
		e.printStackTrace();
	}
	}
}


