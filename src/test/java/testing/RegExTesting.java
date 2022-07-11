package testing;

import java.util.regex.Pattern;

public class RegExTesting {

	public static void main(String[] args) {
		
		String a = "abcd 238789 dafdsfltestabc";
		String b = "abc";
		
		int index = a.length()-b.length();
		String c = a.substring(index);
		System.out.println(c);
		
		System.out.println(Pattern.matches("abc$", a));
		
		
		System.out.println(a.replaceAll("abc", "45435"));
		
		
		System.out.println("String without integers: " + a.replaceAll("[0-9]", ""));
		System.out.println("String with only integers: " + a.replaceAll("[^0-9]", ""));
		System.out.println("String without char 'a', 'd': " + a.replaceAll("[ad]", ""));
		
		

	}

}
