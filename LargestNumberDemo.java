package myprogrammes;

import java.util.Scanner;

public class LargestNumberDemo {
	
    public static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the first number");
		int num1=scanner.nextInt();
		
		System.out.println("enter the second number");
		int num2=scanner.nextInt();
		
		System.out.println("enter the third number");
		int num3=scanner.nextInt();
		
		if(num1>num2&&num1>num3){
			System.out.println("largest number is"+num1);
		}else if(num2>num3&&num2>num1){
			System.out.println("largest number is"+num2);
		}else if(num3>num1&&num3>num2){
			System.out.println("largest number is"+num3);
		}else{
			System.out.println("none of the number is largest");
		}
		

	}

}
