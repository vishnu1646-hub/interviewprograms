package myprogrammes;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={10,20,30,20,30,50,60,50};
	    bruteForce(array);
	    extraMemory(array);

	}

	private static void extraMemory(int[] array) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			if(set.contains(array[i])){
				System.out.println("duplicate element= "+array[i]);
			}else{
				set.add(array[i]);
			}
		}
		
	}

	private static void bruteForce(int[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			     for (int j = i+1 ; j < array.length; j++) {
					if(array[i]==array[j]){
						System.out.println("duplicate elements bruteforce="+array[i]);
					}
				}
		}
		
	}

}
