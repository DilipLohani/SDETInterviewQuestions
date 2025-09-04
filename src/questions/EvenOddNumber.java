package questions;

import java.util.Scanner;

public class EvenOddNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive number");
		int number = sc.nextInt();
		int oddCount = 0;
		int evenCount = 0;

		
		while(number>0) {
			
			int rem =  number % 10;
			
			if(rem%2 ==0) {
				
				evenCount++;
			}
			
			else {
				
				oddCount++;
			}
			
			number = number /10;
			
		}
		
		System.out.println("The even number of this digit is" + " " + evenCount);
		System.out.println("The odd number of this digit is" + " " + oddCount);

		
		
		
	}

}
