package questions;

public class ReverseAStringUsingStringBuffer {
	
	public static void main(String[] args) {
		
		String str = "SDET";
		
		
		StringBuffer sb = new StringBuffer(str);
		StringBuffer rev = sb.reverse();
		
		
		System.out.println(rev);
		
	}

}
