package testing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		
		String sample = "abcdcb";
		// b, c

		//findDuplicateCharacters(sample);
		findDuplicateCharactersUsingStream(sample);

	}
	
	

	public static void findDuplicateCharacters(String str) {

		Set<Character> set = new HashSet<>();
		for(int i=0;i<str.length();i++)
		{
			if(!set.add(str.charAt(i)))
			{
				System.out.println(str.charAt(i));
			}
		}

	}

	public static void findDuplicateCharactersUsingStream(String str) {

		Set<Character> set = new HashSet<>();
		char[] c = str.toCharArray();
		List<Character> lst = new ArrayList<>();

		for(Character e: c) {
			lst.add(e);
		}

		lst.stream().filter(e -> !set.add(e)).forEach(e -> System.out.println(e));

	}

}
