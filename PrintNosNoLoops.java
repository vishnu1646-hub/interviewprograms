package myprogrammes;

public class PrintNosNoLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(1);

	}
	public static void display(int num){
	   if(num<=10){
		   System.out.print(num);
		   display(num+1);
	   }
	}

}
