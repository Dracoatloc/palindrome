package mx.tec.kata;

public class PalindromeValidator {
	
	public boolean validate(String string) {
		String clearString = string.replaceAll("\\s+","");
		for(int i = 0; i < clearString.length() / 2; i++) {
			if(clearString.charAt(i) != clearString.charAt(clearString.length() - 1 -i)) 
			{
				return false;
			}
		}
		return true;
	}
}
