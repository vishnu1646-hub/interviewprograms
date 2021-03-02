package myprogrammes;

public class Prime {
       public static void main(String[] args) {
		int num=2;
		int sam=0;
		for(int j=2;j<=num-1;j++){
			if(num%j==0){
				sam=sam+1;
			}
		}
		if(sam>0){
			System.out.println("the given number"+num+"is not prime");
		}
		else{
			System.out.println("the given number"+num+"is prime");
			
		}
	}	

}
