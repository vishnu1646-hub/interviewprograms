package myprogrammes;

import java.util.Scanner;

public class A2 {
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the string");
		String s=scanner.next();
		int sum=0;
		
		
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(Character.isDigit(ch)){//if(ch>='0'&&ch<='9'){
				int f=Integer.parseInt(ch+"");
				sum=sum+f;
			}
		}
		System.out.println("sum is"+sum);
		

	}

}
