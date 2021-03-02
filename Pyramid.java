package myprogrammes;

public class Pyramid {

	public static void main(String[] args) {
		int a = 1;
		int star = -1;
		int space = 5;
		for (int i = 1; i <= 5; i++) {

			star = star + 2;
			space = space - 1;
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print(a + " ");
			}
			System.out.println();
			a++;
		}
	}

}
