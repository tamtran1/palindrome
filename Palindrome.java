public class Palindrome {
	public static void main (String [] args) {		
		if (palindrome ("race car"))
			System.out.println ("palindrome");
		else
			System.out.println ("not palindrome");
	}
	
	public static boolean palindrome (String arg) {
		arg = arg.replaceAll ("\\s+", "").toLowerCase ();
		
		for (int i = 0, j = arg.length () - 1; i < j; ++i, --j)
			if (arg.charAt (i) != arg.charAt (j))
				return false;
		
		return true;
	}
}