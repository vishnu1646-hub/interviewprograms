package myprogrammes;

import java.util.Scanner;

public class IndexStr {
    static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string: ");
		String s=scanner.nextLine().toUpperCase();
		System.out.println("enter the character value to find no.of occurences:");
		String s1=scanner.next().toUpperCase();
		char ch=s1.charAt(0);
		char[] ch2=s.toCharArray();
		int occur=0;
		for(int i=0;i<s.length();i++){
			int j=s.indexOf(ch,i);
			if(i==j){
				occur++;
			}
//			if(ch==ch2[i]){
//				occur++;
//			}
		}
	   System.out.println("the number of occurences of "+ch+" is: "+occur+" times");
	   
	    
		
		
		

	}
}


