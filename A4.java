package myprogrammes;

public class A4 {

	public static void main(String[] args) {
		int star=0;
		int space=5;
		for (int i = 1; i <=9; i++) {
			
			if(i<=5){
				star++;
				space--;
			}
			if(i>5){
				star--;
				space++;
				
			}
			for (int j = 1; j <=space; j++) {
				System.out.print(" ");
				
			}
			for (int k = 1; k<=star; k++) {
				System.out.print("*");
				
			}
			System.out.println();
			
			
		}
	}

}
