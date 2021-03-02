package myprogrammes;

public class StringRecursion {

	public static void main(String[] args) {
		String s="maddy";
		System.out.println(Vishnu(s));

	}
	private static String Vishnu(String s){
		if(s==null||s.length()<=1)
		return s;
		else
			return Vishnu(s.substring(1))+s.charAt(0);
	}

}
