package myprogrammes;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.standard.PrinterLocation;

public class MajorityElement {
	

	public static void main(String[] args){
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int array[]={10,20,20,20,30};
		
		for (int i = 0; i < array.length; i++) {
				map.put(array[i], map.getOrDefault(array[i], 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()){
			if(entry.getValue()>array.length/2){
				int result=entry.getKey();
				System.out.println(result);
			}
		}

	}

}
