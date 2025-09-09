package questions;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		String s = "Java Programming SDET";
		int totalCountwithA = s.length();
		
		int totalCountwithoutA =  s.replace("a", "").length();
		
		int count = totalCountwithA - totalCountwithoutA;
		
		System.out.println("The number occurance of A's: " + count);

	}

}
