package myprogrammes;

public class Count12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*int n=56782;
    int count=0;
    while(n!=0){
    	n=n/10;
    	count++;
    }
    System.out.println(count);*/
		//or
		System.out.println(String.valueOf(21645).length());
		
		System.out.println(countNumbers(21656));
	}
	public static int countNumbers(Integer n){
		if(n==0)
			return 0;
		
		return 1+countNumbers(n/10);
	}

}
