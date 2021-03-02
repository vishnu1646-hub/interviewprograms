package myprogrammes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="rajarani";
        displayDuplicates(s);
	}
	public static void displayDuplicates(String s){
		Map<Character,Integer> hm=new HashMap<>();
		char[] chs=s.toCharArray();
		for (char c : chs) {
			if(!hm.containsKey(c)){
				hm.put(c, 1);
			}else{
				hm.put(c,hm.get(c)+1);
			}
			Set<Map.Entry<Character,Integer>> entrySet=hm.entrySet();
			for (Map.Entry<Character, Integer> entry : entrySet) {
				if(entry.getValue()>1){
					System.out.printf("%s: %d %n",entry.getKey(),entry.getValue());
				}
			}
			
		}
	}

}
