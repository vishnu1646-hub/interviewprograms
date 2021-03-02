package myprogrammes;

import java.util.Scanner;

public class A1 {
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the size of an array");
		int size=scanner.nextInt();
		char[] ch=new char[size];
		System.out.println("enter the characters:");
		for(int i=0;i<ch.length;i++){
			ch[i]=scanner.next().charAt(0);
			
		}
		System.out.println("the entered characters are:");
		for(int j=0;j<ch.length;j++){
			System.out.println(ch[j]);
		}
	}

}
