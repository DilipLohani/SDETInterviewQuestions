package questions;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		int number = 12;
		int count = 0;
		
		while(number>0) {
			
			number = number/10;
			count++;
			
		}
		
		System.out.println("The number of digits are:" + " " +count);
	}

}
