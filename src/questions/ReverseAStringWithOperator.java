package questions;

public class ReverseAStringWithOperator {
	
	public static void main(String[] args) {
		
		String str = "SDET";
		String rev = "";
		
		for(int i= str.length()-1;i>=0;i--) {
			
		 rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
		
	}

}
