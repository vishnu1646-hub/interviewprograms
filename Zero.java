package myprogrammes;

public class Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]={10,0,0,20,40,50,60};
        int newArr[]=new int[arr.length];
        rearrange(arr,newArr);
        Print(newArr);
	}

	private static void Print(int[] newArr) {
		System.out.println("elements after adding zero to ends of array");
		for (int i : newArr) {
			System.out.println(i);
		}
		
	}

	private static void rearrange(int[] arr, int[] newArr) {
		// TODO Auto-generated method stub
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0){
					newArr[j]=arr[i];
					j++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0){
					newArr[j]=arr[i];
					j++;
			}
		}
	}

}
