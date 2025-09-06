package questions;

public class SumOfArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int sum = 0;
		
		for(int i=0;i<=a.length-1;i++) {
			sum = sum + a[i];
		}
		
		/*Enhanced for loop
		
		for(int value:a) {
			sum = sum + value;
		}*/
		
		System.out.println("The sum of given array is" + " "+ sum);

	}

}
