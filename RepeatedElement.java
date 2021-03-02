package myprogrammes;

public class RepeatedElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int array[]={1,5,2,1,2,4};
        int temp[]=new int[array.length];
        for (int i = 0; i < temp.length; i++) {
			if(temp[array[i]]==1){
				System.out.println(array[i]);
			}
			else{
				temp[array[i]]++;
			}
		}
	}

}
