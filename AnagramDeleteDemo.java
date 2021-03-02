package myprogrammes;

public class AnagramDeleteDemo {
   
	public static void main(String[] args) {
		String str1="java";
		String str2="avaj";
		System.out.println(anagramCheck(str1,str2));
	}

	public static boolean anagramCheck(String str1, String str2) {
		char[] chString1=str1.toCharArray();
		StringBuilder sBuilder=new StringBuilder(str2);
		for (char c : chString1) {
			int index=sBuilder.indexOf(String.valueOf(c));
			if(index!=-1){
				sBuilder.deleteCharAt(index);
			}else{
				return false;
			}
		}
		return sBuilder.length()==0;
			
		
	}

}
