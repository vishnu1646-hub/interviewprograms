package myprogrammes;

public class FactDemo {

	public static void main(String[] args) {
		for (int i = 1; i <=100; i++) {
			System.out.println("factors of a number :"+i+" are ");
			 for (int j =1; j <=i; j++) {
				if(i%j==0){
			       System.out.print(j+",");
				}
			}
			 System.out.println();
			
		}

	}

}
