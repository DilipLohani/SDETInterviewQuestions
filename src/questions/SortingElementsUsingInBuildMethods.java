package questions;

import java.util.Arrays;
import java.util.Collections;

public class SortingElementsUsingInBuildMethods {

	public static void main(String[] args) {
		
		//Approach1
		
		Integer a[] = {10,2,5,67,8};
		
		System.out.println("Before sorting" + Arrays.toString(a));
		/*Arrays.parallelSort(a);
		System.out.println("After sorting" + Arrays.toString(a));*/
		
		//Approach2
		/*Arrays.sort(a);
		System.out.println("After sorting" + Arrays.toString(a));*/
		
		//Approach3 - Sort the element in descending order
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("After sorting" + Arrays.toString(a));
		
		

	}

}
