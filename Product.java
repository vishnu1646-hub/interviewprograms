
package myprogrammes;

import java.util.Scanner;

public class Product {
    static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the string:");
		String s=scanner.next();
		int product=1;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9'){
				int a=Integer.parseInt(ch+"");
				product=product*a;
			}
		}
		System.out.println("the product of digits is:"+product);
		
		
	}

}
