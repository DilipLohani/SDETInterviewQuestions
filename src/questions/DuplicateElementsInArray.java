package questions;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String arr[] = {"java","c++","python","javas"};
		
//		boolean flag = false;
//		
//		for(int i=0;i<arr.length;i++) {
//			
//			for(int j=i+1;j<arr.length;j++) {
//				
//				if(arr[i]==arr[j]) {
//					System.out.println("The duplicate value of given array is: " + arr[i]);
//					 flag = true;
//					
//				}
//			}
//				
//			
//		}
//		
//		if(flag==false) {
//			System.out.println("No duplicate values are presnt in the array.");
//		}

		//approach -2 using hashset
		
		boolean flag = false;
		
		HashSet<String> langs = new HashSet();
		
		for(String l:arr) {
			
			if(langs.add(l)==false){
				System.out.println("Found duplicate values: " + l);
				flag = true;
			}
		}
		
		if(flag == false) {
			System.out.println("Not found duplicates");
		}
		
	}

}
