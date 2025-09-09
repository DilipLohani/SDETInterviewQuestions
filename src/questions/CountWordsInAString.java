package questions;

import java.util.Scanner;

public class CountWordsInAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		
		String str = sc.nextLine(); //welcome to java
		
		int count =1;
		
		for(int i=0;i<str.length()-1;i++) {
			
			if((str.charAt(i)== ' ') && (str.charAt(i+1)!=  ' ')){
				
				count++;
				
			}
		}
		
		System.out.println("Numbers of words in a string :"+ count);
		
		

	}

}
