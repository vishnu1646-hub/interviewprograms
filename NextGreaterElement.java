package myprogrammes;

public class NextGreaterElement {

	public static void main(String[] args) {
		int array[]={11,21,13,14};
		printNextGreaterElement(array);

	}

	private static void printNextGreaterElement(int[] array) {
		int next;
		for (int i = 0; i < array.length; i++) {
			  next=-1;
			      for(int j=i+1;j<array.length;j++){
			    	  if(array[i]<array[j]){
			    		  next=array[j];
			    		  break;
			    	  }
			      }
			      System.out.println(array[i]+","+next);
			
		}
		
	}

}