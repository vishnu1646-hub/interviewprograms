package myprogrammes;

import java.util.Scanner;

public class FLW {
    static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the sentence:");
		String s=scanner.nextLine();
		String[] s1=new String[s.length()];
		s1=s.split(" ");
		System.out.print("first letters are: ");
		for (int i = 0; i < s1.length; i++) {
			char ch=s1[i].charAt(0);
			System.out.print(String.valueOf(ch));
		}

	}

}
