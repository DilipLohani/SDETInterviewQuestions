package questions;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a postive number:");
		int number = sc.nextInt();
		long factorial = 1;
		
		for(int i=1;i<=number;i++) {
			factorial = factorial * i;
		}
		
		System.out.println("The factorial number of given input is" + " "+ factorial);
		

	}

}
