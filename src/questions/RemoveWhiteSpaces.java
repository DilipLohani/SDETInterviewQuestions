package questions;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "Java Programming     and Selenium automation";
		
		str = str.replaceAll("\\s", "");
		
		System.out.println(str);

	}

}
