package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.Assert;

public class StringPrograms {

	public static void main(String[] args) {

		String toFindMaxRepeatingSubString = "abc12ssssssssssss34ayyyyyyyyyyyyboioi1234lkjdddddafsssssssssssskyyyyld1234";
		//String toFindMaxRepeatingSubString = "aaabaaa";

		//retrieveMaximumRepeatingSubString(toFindMaxRepeatingSubString);

		//retriveMaxRepeatingCharacterFromString(toFindMaxRepeatingSubString);

		//String findMaxPalindrome = "abcddtddcll";
		String findMaxPalindrome = "abcddcba";
		retrieveMaxLengthOfPalindromeSubstring(findMaxPalindrome);
	}

	public static String retrieveMaxLengthOfPalindromeSubstring(String mainString) {

		String max = null;

		if(mainString==null || mainString.trim().equals("")) {
			System.out.println("String cannot be null Or must have at least 1 character");
			return null;
		}
		
		StringBuilder bd = new StringBuilder(mainString);
		if (mainString.equals(new String(bd.reverse()))) {
			System.out.println("Max length of palindrome substring is: " + bd.length() + " and the substring is: " + bd);
			return mainString;
		}

		int n=2;

		outerloop:
		for(int i=bd.length()-1;i>0;i--) {
			int temp = i;
			for(int j=0; j<n;j++) {
				String subStr = mainString.substring(j,temp);
				StringBuilder bf = new StringBuilder(subStr);

				if(subStr.equals(new String(bf.reverse())))
				{
					System.out.println("Longest palindrom sequence is: " + subStr);
					max = subStr;
					break outerloop;
				}
				temp+=1;
			}
			n+=1;
		}
		
		return max;
	}


	public static void retriveMaxRepeatingCharacterFromString(String value) {

		//loop1: 0-length of string
		//loop2: 1-length of string

		char[] arr = value.toCharArray();

		StringBuffer finalString = new StringBuffer();
		Set<String> multipleRepeatingChar = new HashSet<>();


		for(int i=0;i<value.length();i++) {

			StringBuffer temp = new StringBuffer();

			for(int j=(i+1);j<value.length();j++) {

				if (arr[i]==arr[j]) {
					temp.append(arr[i]);
				}
				else
				{
					break;
				}

			}

			if(temp.length()>finalString.length()) {
				finalString = temp;
			}
			else if(temp.length()==finalString.length() 
					&& temp.length()!=0
					&& !(new String(finalString).equals(new String(temp)))
					) {
				multipleRepeatingChar.add(new String(temp));
			}
		}

		if(multipleRepeatingChar.isEmpty()) {

			System.out.println("Maximum Repeating Character is: " + finalString.substring(0,1) +
					"\nAnd its length is: " + (finalString.length()+1));
		}
		else {
			System.out.println("There are multiple characters which are repeating" + 
					"\nAnd their length is: " + (finalString.length()+1) +
					"\nAnd they are:\n" + finalString.substring(0,1));

			multipleRepeatingChar.stream().forEach(e -> System.out.println(e.substring(0,1) + "\n"));

		}


	}


	//Get the maximum repeating substring from the string
	public static void retrieveMaximumRepeatingSubString(String value) {

		if(value==null) {
			Assert.fail("String cannot be a null value");
		}

		//List of substrings
		//a , ab, abc, abc123, 
		List<String> st = new ArrayList<>();

		for(int i=0;i<value.length();i++) {

			st.add(value.substring(i, value.length()));
		}


		Collections.sort(st);		

		System.out.println(st);

		int counter = 0;

		for(int j=0;j<st.size()-1;j++) {

			char[] str1 = st.get(j).toCharArray();
			char[] str2 = st.get(j+1).toCharArray();

			int maxLoop = str1.length;

			if(str1.length>str2.length) {
				maxLoop = str2.length;
			}

			int internalCounter = 0;

			for(int k=0;k<maxLoop;k++) {
				if(str1[k]==str2[k]) {
					internalCounter +=1;
				}
				else {
					break;
				}
			}

			if(internalCounter>counter) {
				counter = internalCounter;
			}	
		}	

		System.out.println("Maximum repeating substring is: " + counter);
	}



}
