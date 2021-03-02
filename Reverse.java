package myprogrammes;

import java.util.Scanner;

public class Reverse {
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the string:");
		String s=scanner.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++){
			s1=s.charAt(i)+s1;
		}
		System.out.println("the reverse string is:"+s1);
		
	}

}
