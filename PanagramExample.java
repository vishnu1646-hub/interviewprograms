package myprogrammes;

public class PanagramExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="The quick brown fox jumps over the lazy dog";
		s=s.toLowerCase();
		boolean b=isPanagram(s);
		if(b)
			System.out.println("given string is panagram");
		else
			System.out.println("given string is not a panagram");

	}

	private static boolean isPanagram(String s) {
		// TODO Auto-generated method stub
		if(s.length()<26)
			return false;
		else{
			for(char ch='a';ch<='z';ch++){
				if(s.indexOf(ch)<0){
					return false;
				}
			}
		}
		return true;
	}

}
