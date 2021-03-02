package myprogrammes;

import java.util.HashSet;

public class LongestSubstring {

	public static void main(String[] args) {
		String str="abcdab";
		System.out.println(longest(str));

	}

	private static String longest(String str) {
		HashSet<Character> set=new HashSet<>();
		String longestTillnow="";
		String longestOverall="";
		for (int i = 0; i <str.length(); i++) {
			char c=str.charAt(i);
			if(set.contains(c)){
				longestTillnow="";
				set.clear();
			}
			set.add(c);
			longestTillnow+=c;
			if(longestTillnow.length()>longestOverall.length()){
				longestOverall=longestTillnow;
			}
				
			
		}
		return longestOverall;
		
	}

}
