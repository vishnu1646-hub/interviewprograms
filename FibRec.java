package myprogrammes;

public class FibRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		System.out.print(a+" ");
        System.out.print(b+" ");
        fab(a,b);
	}
	public static void fab(int a,int b){
		int c=0;
		c=a+b;
		a=b;
		b=c;
		if(c<100){
			System.out.print(c+" ");
			fab(a,b);
		}
		
		
	}

}
