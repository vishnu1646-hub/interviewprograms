package myprogrammes;

import java.util.Arrays;
import java.util.Collections;

public class AscendingSorting {

	public static void main(String[] args) {
		String string[]={"a","b","z","c","s"};
		Arrays.sort(string);
		
		System.out.println("after sorting: ");
		for (String string2 : string) {
			System.out.println(string2);
		}
		
		Arrays.sort(string, Collections.reverseOrder());
		System.out.println("after sorting in ascending order");
		for (String s2 : string) {
			System.out.println(s2);
		}

	}

}
