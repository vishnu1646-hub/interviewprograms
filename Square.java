package myprogrammes;

import java.util.Scanner;

public class Square {
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the number");
		int i=scanner.nextInt();
		for (int j=1; j<i; j++) {
			if(j*j==i){
				System.out.println("the perfect square is:"+j);
				return;
			}
			
		}
		
	}

}
