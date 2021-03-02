package myprogrammes;

import java.util.Scanner;

public class NaturalNumbers {
    static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.out.println("enter the n value:");
    	int x=scanner.nextInt();
    	int sum=0;
    	for(int i=1;i<=x;i++){
    		sum=sum+i;
    	}
    	System.out.println("the sum of natural numbers is: "+sum);

	}

}
