package questions;

public class MaxAndMinElementsInArray {

	public static void main(String[] args) {
		int a[] = {1,2,-4,10,15};
		
		int max = a[0];
		int min = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
			if(a[i]<min) {
				min = a[i];
			}
		}
		
		System.out.println("The maximum and minum values of given array are:"+ max + ","+ min);

	}

}
