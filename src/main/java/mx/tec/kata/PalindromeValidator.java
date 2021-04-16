package mx.tec.kata;

public class PalindromeValidator {
	
	public boolean validate(String string) {
		if(string.length() == 1)
		{
			return true;
		}
		else if(string.length() == 2 && string.charAt(0) == string.charAt(1))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
