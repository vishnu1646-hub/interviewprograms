package myprogrammes;

import java.util.Scanner;

public class ArrayInsert {
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
	 int[] arr=new int[5];
	 System.out.println("enter the elements");
	 for(int i=0;i<arr.length;i++){
		 arr[i]=scanner.nextInt();
	 }
	 System.out.println("printing elements before insert:");
	 for (int i : arr) {
		System.out.println(i);
	}
	 System.out.println("enter the location at which we want to insert:");
	 int location=scanner.nextInt();
	 System.out.println("enter the value:");
	 int value=scanner.nextInt();
	 for (int i =arr.length-1; i>location; i--) {
		 arr[i]=arr[i-1];
		
	}
	 arr[location]=value;
	 for (int i : arr) {
		System.out.println(i);
	}
	 

	}

}
