package myprogrammes;

import java.util.Scanner;

public class StringDemo1 {
    static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		int count=0;
		System.out.println("enter the string");
		String s=scanner.nextLine();
		System.out.println("enter the character:");
		char s1=scanner.next().charAt(0);
		for (int i = 0; i <s.length(); i++) {
			if(s.charAt(i)==s1){
				count++;
			}
			
		}
		System.out.println("the no.of occurence of "+ s1 +" is: "+ count);

	}

}
