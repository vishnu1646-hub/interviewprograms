package myprogrammes;

import java.util.Scanner;

public class MaximumDifferenceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stubumber 
		int n,max,min;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number of elements");
        n=scanner.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements of array");
        for (int i = 0; i <n; i++) {
			a[i]=scanner.nextInt();
		}
        max=a[0];min=a[0];
        for (int i = 0; i <n; i++) {
			if(a[i]>max){
				max=a[i];
			}
		}
        for (int i = 0; i <n; i++) {
			if(a[i]<min){
				a[i]=min;
			}
		} 
        System.out.println("maximum= "+max);
        System.out.println("min= "+min);
        System.out.println("maximum differencee is= "+(max-min));
        
        
	}

}
