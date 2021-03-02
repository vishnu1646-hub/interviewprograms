package myprogrammes;

import java.util.Scanner;

public class FLS {
    static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number:");
		int number=scanner.nextInt();
		int lD=number%10;
		int fD=number;
		while(fD>=10){
			fD=fD/10;
		}
		System.out.println("first digit is: "+fD);
		System.out.println("last digit is :"+lD);
		System.out.println("sum is:"+(lD+fD));

	}

}
