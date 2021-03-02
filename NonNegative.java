package myprogrammes;

public class NonNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={-1,-20,30,0,-3,40,50,-8};
		int newArr[]=new int[arr.length];
		changeNegative(arr,newArr);
		printNegative(newArr);

	}

	private static void printNegative(int[] newArr) {
		System.out.println("changed array is");
		for (int i : newArr) {
			System.out.print(i+" ");
		}
		
	}

	private static void changeNegative(int[] arr, int[] newArr) {
		// TODO Auto-generated method stub
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0){
				newArr[j]=arr[i];
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=0){
				newArr[j]=arr[i];
				j++;
			}
		}
		
		
	}

}
