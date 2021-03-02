package myprogrammes;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int inArray[]={3,4,5,6,1,2};
		System.out.println("before sorting");
		for (int i : inArray) {
			System.out.println(i);
		}
        bubbleSort(inArray);
        System.out.println("after sorting");
        for (int i : inArray) {
			System.out.println(i);		
	    }
	}

	private static void bubbleSort(int[] inArray) {
		int temp=0;
		for (int i = 0; i <inArray.length; i++) {
			for (int j = 1; j<(inArray.length)-i; j++) {
				if(inArray[j-1]>inArray[j]){
					temp=inArray[j-1];
					inArray[j-1]=inArray[j];
					inArray[j]=temp;
				}
			}
		}
		
	}
	

}
