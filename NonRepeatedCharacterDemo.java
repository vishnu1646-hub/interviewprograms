package myprogrammes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatedCharacterDemo {

	public static void main(String[] args) {
		char c=getFirstNonRepeatedChar("aabbddeef");
		System.out.println("non repeated character is: "+c);

	}
	public static char getFirstNonRepeatedChar(String str) {
		Map<Character,Integer> countMap=new LinkedHashMap<Character,Integer>();
		for (char ch : str.toCharArray()) {
			countMap.put(ch,countMap.containsKey(ch) ? countMap.get(ch)+1 : 1);
		}
		for(Entry<Character,Integer> entry: countMap.entrySet()){
		if(entry.getValue()==1){	
		return entry.getKey();
		}
		}
		throw new RuntimeException("didnt find any non repeated character");
	}
	

}
