package myprogrammes;

public class StockBuyAndSell {

	public static void main(String[] args) {
		int array[]={3,20,40,200,90};
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if(array[i]<min){
				min=array[i];
			}
			if(array[i]-min>max){
				max=array[i]-min;
				
			}
			
		}
		System.out.println("maximum value: "+max);
		

	}

}
