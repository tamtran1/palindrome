using System;

class Test {
	static void Main () {
		Console.WriteLine (palindrom ("race cara") ? "palindrome" : "not palindrom");
	}
	
	public static bool palindrom (String arg) {
		arg = arg.Replace (" ", string.Empty).ToLower ();
		
		for (int i = 0, j = arg.Length - 1; i < j; ++i, --j)
			if (arg [i] != arg [j])
				return false;
		
		return true;
	}
}