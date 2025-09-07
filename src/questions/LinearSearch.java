package questions;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {100,200,40,94,39};
		
		int seachElement = 100;
		boolean flag = false;
		
		for(int i=0;i<arr.length;i++) {
			if(seachElement==arr[i]) {
				System.out.println("The element is found and the index of the element is:" + i);
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("The search element is not present in the array");
		}

	}

}
