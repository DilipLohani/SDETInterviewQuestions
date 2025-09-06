package questions;

import java.util.Arrays;

public class CheckArraysAreEquals {

	public static void main(String[] args) {
		int a1[] = {1,2,3,4,5};
		int a2[] = {1,2,4,5,6};
		
		 boolean status = Arrays.equals(a1,a2);
		 
		 if(status == true) {
			 System.out.println("The given arrays are equals");
		 }
		 else {
			 System.out.println("The given arrays are not equals");
		 }
		
		
	}


}
