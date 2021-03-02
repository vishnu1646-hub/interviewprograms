package myprogrammes;

public class CountCharacters {
	
	static void count(String str){
	    //create a character array for given string
		char[] ch=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			//declare a string with empty initialization
			String s="";
			//when the charcter is not space
			while(i<ch.length&&ch[i]!=' '){
				//concat with declared string
				s=s+ch[i];
				i++;
			}
			if(s.length()>0){
				System.out.println(s + "--> "+s.length());
			}
		}
		
	}

	public static void main(String[] args) {
		String string="Hello World";
		count(string);
	

	}

}
