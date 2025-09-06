package questions;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		int a[] = {1,2,4,5};
		int n = a.length + 1;
		
		int expectedSum = n*(n+1)/2;
		int actualSum = 0;
		
		for(int num:a) {
			actualSum = actualSum + num;
		}
		
		int missingNumber = expectedSum - actualSum;
		System.out.println("The missing number from an array is:"+ missingNumber);

	}

}
