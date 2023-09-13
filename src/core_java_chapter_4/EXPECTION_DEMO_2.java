//program to print the exception information using toString() method
package core_java_chapter_4;
import java.io.*;

class EXPECTION_DEMO_2 {
	public static void main (String[] args) {
	int a=5;
	int b=0;
		try{
		System.out.println(a/b);
		}
	catch(ArithmeticException e){
		System.out.println(e.toString());
	}
	}
}
