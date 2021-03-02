package myprogrammes;

import java.util.Scanner;

public class CalculatorDemo {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		double num1, num2;
		System.out.println("enter the numbers:");
		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();
		System.out.println("enter the operation +,*,/,- ");
		char ch = scanner.next().charAt(0);
		double l = 0;
		switch (ch) {
		case '+':
			l = num1 + num2;
			break;
		case '-':
			l = num1 - num2;
			break;
		case '*':
			l = num1 * num2;
			break;
		case '/':
			l = num1 / num2;
			break;

		default:
			System.out.println("enter the proper operator");
			break;

		}
		System.out.println(num1 + "" + ch + " " + num2 + "=" + l);

	}

}
