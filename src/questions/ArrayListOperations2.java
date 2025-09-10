package questions;

import java.util.ArrayList;

public class ArrayListOperations2 {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		
		System.out.println(number);
		
		number.add(2, 25);
		
		System.out.println(number);
		
		number.set(3, 100);
		
		System.out.println(number);
		
		number.remove(1);
		
		System.out.println(number);
		

	}

}
