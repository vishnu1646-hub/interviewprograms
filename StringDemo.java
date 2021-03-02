package myprogrammes;

import java.util.Scanner;

public class StringDemo {
    static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
    	System.out.println("enter the string");
    	String str = scanner.nextLine();
    	int initialLength=str.length();
    	System.out.println("enter the character to find number of occurences: ");
    	String str1 = scanner.next();
    	str=str.replace(str1,"");
    	int finalLength=str.length();
    	System.out.println("the no.of occurences of"+str1+"is: "+(initialLength-finalLength));
		

	}

}
