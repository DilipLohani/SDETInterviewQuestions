package questions;

public class RemoveJunkFromString {

	public static void main(String[] args) {
		String str = "I@##@$$%%%$$$Dilip";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);

	}

}
