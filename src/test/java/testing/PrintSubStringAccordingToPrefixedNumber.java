package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintSubStringAccordingToPrefixedNumber {

	public static void main(String[] args) {
		String str = "1a2bc3d";
		//output should be: abcbcddd
		
		printUsingRegex(str);
		bruteForce(str);

	}

	//Not all possible scenarios are handled here
	//For example: if number is >=10, this will not work
	//Or if the string starts from character
	//We will need additional conditions to handle them
	//That is the reason why best method is below printUsingRegex()
	public static void bruteForce(String str) {
		String f = "";

		for(int i=0;i<str.length();i++) {
			Character c = str.charAt(i);

			if(c.toString().matches("[0-9]")) {
				String t = "";
				for(int j=i+1;j<str.length();j++) {
					Character cn = str.charAt(j);
					if(cn.toString().matches("[^0-9]")) {
						t+=cn.toString();
					}
					else {
						i=j-1;
						break;
					}
				}

				for(int j=0;j<Integer.parseInt(c.toString());j++) {
					f += t;
				}
			}
		}
		
		System.out.println("Output by Brute force: " + f);
	}

	public static void printUsingRegex(String str) {
		List<String> sw = new ArrayList<>(Arrays.asList(str.split("[0-9]")));
		sw = removeBlankValues(sw);
		List<String> so = new ArrayList<>(Arrays.asList(str.split("[^0-9]")));
		so = removeBlankValues(so);

		String f = "";
		for(int i=0;i<sw.size();i++) {
			for(int j=0;j<Integer.parseInt(so.get(i));j++) {
				f +=sw.get(i);
			}
		}

		System.out.println("Output by split stirng using regex: " + f);
	}


	public static List<String> removeBlankValues(List<String> list) {

		return list.stream().filter(e -> !e.equals("")).collect(Collectors.toList());

	}

}
