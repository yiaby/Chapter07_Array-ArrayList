package exercise;

public class ArrayEven {

	public static void main(String[] args) {
		int [] even = new int [5];
		int sum = 0;
		int j = 1;
		
		for(;j<=10;) {
			for(int i=0; i<even.length; i++,j++) {
			 if(j%2 == 0) {	         
				even[i] = j;
				sum += even[i];
			}
				 
		 }
			
	  }	
		for(int i=0; i<even.length; i++) {
			System.out.println(even[i] + " ");
	   }
    }		
 }
	
	


