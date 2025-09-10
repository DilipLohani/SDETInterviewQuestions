package questions;

import java.util.ArrayList;

public class ArrayListOperations1 {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		
		System.out.println(fruits);
		
		fruits.add(1, "Orange");
		
		System.out.println(fruits);
		
		fruits.set(2, "Graps");
		
		System.out.println(fruits);
		
		fruits.remove(0);
		
		System.out.println(fruits);
		
		
		
		
		

	}

}
