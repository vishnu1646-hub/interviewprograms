package myprogrammes;

import java.util.Scanner;

public class Pali {
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the string:");
		String s=scanner.next();
		String r=s;
		String s1="";
		for(int i=0;i<s.length();i++){
			s1=s.charAt(i)+s1;
		}
		System.out.println(s1);
		if(r.equals(s1)){
			System.out.println("palindrome");
			
		}
		else{
			System.out.println("not palindrome");
		}
		
	}

}
