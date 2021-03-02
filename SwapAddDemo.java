package myprogrammes;

public class SwapAddDemo {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a+","+b);
        swape(a,b);
	}
	public static void swape(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+","+b);
	}
	

}
