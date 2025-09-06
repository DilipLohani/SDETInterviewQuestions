package questions;

public class PrintEvenNumberFromAnArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		
		System.out.println("The even numebrs are from an array:");
		for(int value:a) {
			if(value%2==0) {
				System.out.println(value);
			}

		}

	}

}
