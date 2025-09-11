package questions;

public class ReverseEachWordInAString {

	public static void main(String[] args) {
		String st = "Welcome to java";
		
		String[] words = st.split(" ");
		
		String reveseString = "";
		
		for(String w:words) {
			
			String reverseW = "";
			
			for(int i=w.length()-1;i>=0;i--) {
				
				reverseW += w.charAt(i);
			}
			
			reveseString += reverseW + " ";
			
		}
		
		
		System.out.println(reveseString);

	}

}
