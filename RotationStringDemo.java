package myprogrammes;

public class RotationStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isRotatedVersion("abcd","dcba"));

	}
	public static boolean isRotatedVersion(String str,String rotatedStr){
		
		if(str==null||rotatedStr==null){
			return false;
		}else if(str.length()!=rotatedStr.length()){
			return false;
		}else{
		     String concatenated=str+str;
		     return concatenated.contains(rotatedStr);
		}
	}

}
