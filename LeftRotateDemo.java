package myprogrammes;

public class LeftRotateDemo {

	public static void main(String[] args) {
		int array[]={10,20,30,40};
		//store the first element in the temp variable
		int temp=array[0];
		for (int i = 1; i < array.length; i++) {
			array[i-1]=array[i];
		}
		//store temp variable in last position
        array[array.length-1]=temp;
        for (int i : array) {
			System.out.println(i);
		}
	}

}
