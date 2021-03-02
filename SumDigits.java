package myprogrammes;

public class SumDigits {

	public static void main(String[] args) {
		int num=1234;
		int n=num;
		int digit=0;
		int sum=0;
		while(num>0){
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("the sum of digits of "+n+"is: "+sum);

	}

}
