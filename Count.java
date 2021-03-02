package myprogrammes;

public class Count {

	public static void main(String[] args) {
		int i=234657223;
		int rem=0;
		int countEven=0;
		int countOdd=0;
		while(i>0){
			rem=i%10;
			if(rem%2==0){
				countEven++;
				
			}
			else{
				countOdd++;
			}
			i=i/10;
			
		}
		System.out.println("the number of even digits are:"+countEven);
		System.out.println("the number of odd digits are:"+countOdd);
	}

}
