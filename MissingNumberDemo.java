package myprogrammes;

import java.util.Arrays;

public class MissingNumberDemo {

	public static void main(String[] args) {
		int array[]={1,2,3,4,5};
		int m=getMissingNumberDemo(array,6);
		System.out.println("missing number in array "+Arrays.toString(array)+" is "+m);
		

	}
	private static int getMissingNumberDemo(int[] array,int n) {
		int actualSum=0;
		int expectedSum=(n*(n+1)/2);
		for (int i : array) {
			actualSum=actualSum+i;
		}
		return expectedSum-actualSum;
		
	}

}