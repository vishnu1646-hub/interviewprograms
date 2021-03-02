package myprogrammes;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapDemo {

	public static void main(String[] args) {
	Map<String, String> uM=new HashMap<>();
    uM.put("apple", "apple");
    uM.put("pineapple","pineapple");
    uM.put("banana","banana");
    uM.put("guava", "guava");
    System.out.println("unsorted key value");
    for (Map.Entry<String,String> entry: uM.entrySet()) {
		System.out.println(entry.getKey());
	}
    
    Map<String, String> treeMap=new TreeMap<String, String>(uM);
    System.out.println("sorted key value");
    for (Map.Entry<String,String> entry: treeMap.entrySet()) {
		System.out.println(entry.getKey());
	}
	}

}
