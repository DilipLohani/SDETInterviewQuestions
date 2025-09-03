package questions;
import java.util.Scanner;

//14641

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		
		int num = sc.nextInt();
		
		int org_num = num;
		
		int rev = 0;
		
		while(num!=0) {
			
			rev = rev *10 + num %10;
			num = num/10;
		}
		
		if(org_num == rev) {
			
			System.out.println("The given number is palindrome");
		}
		
		else {
			
			System.out.println("The given number is not palindrome");
		}
		
	}
	
	

}
