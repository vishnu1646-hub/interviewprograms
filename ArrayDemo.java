package myprogrammes;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1={1,2,3,9,8,7};
		Integer[] arr2={4,1,2,10,15};
		Integer[] arr3={5,1,2,4,10};
		
		HashSet<Integer> h=new HashSet<>();
		List<Integer> l1=Arrays.asList(arr1);
		List<Integer> l2=Arrays.asList(arr2);
		List<Integer> l3=Arrays.asList(arr3);
		h.addAll(l1);
		h.addAll(l2);
		h.addAll(l3);
		List<Integer> finalList=new ArrayList<Integer>();
		for (Integer n : h) {
			if((l1.contains(n)&&l2.contains(n))||
			   (l2.contains(n)&&l3.contains(n))||
			   (l3.contains(n)&&l1.contains(n))){
				finalList.add(n);
			}
		}
		System.out.println(finalList);
		
		
		
		
	}

}
