package myprogrammes;

public class Prime1 {
	public static void main(String[] args) {
		int num=100;
		int prime=0;
      for(int i=2;i<=num-1;i++){
		for(int j=2;j<=num-1;j++){
			if(i%j==0){
				prime=prime+1;
			}
		}
		if(prime==1)
		 System.out.print(i+" ");
//		if(prime>1){
//			
//		}
//		else{
//		System.out.print(i+" ");
//		}
		prime=0;
		
      }
	}

}
