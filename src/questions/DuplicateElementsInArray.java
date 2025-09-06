package questions;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String arr[] = {"java","c++","python","java"};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					System.out.println("The duplicate value of given array is: " + arr[i]  );
				}
			}
				
			
		}

	}

}
