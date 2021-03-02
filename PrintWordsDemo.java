package myprogrammes;

import java.util.Map;
import java.util.TreeMap;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class PrintWordsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hi this is maddy.";
		PrintWordsDemo p=new PrintWordsDemo();
		p.getWordVowelCount(str);
		p.frequency(str);

	}
    private void getWordVowelCount(String str) {
		// TODO Auto-generated method stub
    	int wordCount=0;int vowelCount=0;int upperCaseCount=0;
    	for(int i=0;i<str.length();i++){
    		char c=str.charAt(i);
    		switch(c){
    		case ' ':
    		case '.':
    			wordCount++;
    		}
    		switch(c){
    		case 'A':
    		case 'E':
    		case 'I':
    		case 'O':
    		case 'U':
    		case 'a':
    		case 'e':
    		case 'i':
    		case 'o':
    		case 'u':
    			vowelCount++;
    		}
    		if(c>=65&&c<=90){
    			upperCaseCount++;
    		}
    	}
    	System.out.println("word count= "+wordCount);
    	System.out.println("vowel count= "+vowelCount);
    	System.out.println("uppercase count= "+upperCaseCount);
    }
    
    
    private void frequency(String str) {
		// TODO Auto-generated method stub
    	TreeMap<Character, Integer> map=new TreeMap<>();
    	for(int i=0;i<str.length();i++){
    		Integer c=map.get(str.charAt(i));
    	    if(map.get(str.charAt(i))==null){
    	    	map.put(str.charAt(i), 1);
    	    }else{
    	    	map.put(str.charAt(i),++c);
    	    }
    	    	
    	}
    for(Map.Entry entry: map.entrySet()){
    	System.out.println("character= "+entry.getKey());
    	System.out.println("frequency= "+entry.getValue());
    }
}
}
	



