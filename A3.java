package myprogrammes;

public class A3 {

	public static void main(String[] args) {
		int star=11;
		int space=-2;
		for(int i=1;i<=5;i++){
			star=star-2;
			space=space+2;
			for (int j = 1; j <=space; j++) {
				System.out.print(" ");
				
			}
			for (int j = 1; j <=star; j++) {
				System.out.print("* ");
				
				
			}
			System.out.println();
		}

	}

}
