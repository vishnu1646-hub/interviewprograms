package myprogrammes;

import java.util.Scanner;

public class EvenWordDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string");
		String string=scanner.nextLine();
//		String[] s=new String[string.length()-1];
//		s=string.split(" ");
//		for (int i = 0; i < s.length; i++) {
//			if(((s[i].length())%2)==0){
//				System.out.println("word: "+s[i]+" has even length of "+s[i].length());
//				
//			}
//		}
		for (String s: string.split(" ")) {
			if(s.length()%2==0){
				System.out.println(s);
			}
		}

	}

}
