package myprogrammes;

import java.util.Scanner;

public class MatrixDemo {
    static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		int r,c;
		System.out.println("enter the number of rows in matrix");
		r=scanner.nextInt();
		System.out.println("enter the number of columns in matrix");
		c=scanner.nextInt();
		int matrix[][]=new int[r][c];
		System.out.println("enter the elements of matrix");
		for (int i = 0; i <r; i++) {
			for (int j  = 0; j <c; j++) {
				matrix[i][j]=scanner.nextInt();
			}
		}
		System.out.println("displaying elements of matrix");
		for (int i = 0; i <r; i++) {
			for (int j = 0; j <c; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}
