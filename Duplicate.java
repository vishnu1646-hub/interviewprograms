package myprogrammes;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] x={1,2,3,4,10,3,7};
		for(int i=0;i<x.length;i++){
			for(int j=i+1;j<x.length;j++){
				if(x[i]==x[j]){
					System.out.println(x[i]);
					return;
				}
			}
		}

	}

}
