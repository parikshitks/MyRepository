package testing;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TestClass {


	public static void main(String[] args) {
		//testMethod();
		//nextOne();
		//selectCommonRepeatingVar();
		//reverseSentense();
		reverseEachWordOfSentense();

	}
	
	public static void reverseSentense() {
		
		String str = "This is String";
		
		
		String[] arr = str.split(" ");
		StringBuffer bff = new StringBuffer();
		
		
		for(int i=arr.length-1;i>=0;i--) {
			bff.append(arr[i] + " ");
		}
		
		System.out.println(bff);
		
	}
	
	public static void reverseEachWordOfSentense() {
		String str = "This is String";
		StringBuffer bff = new StringBuffer();
		
		for(int i=str.length()-1;i>=0;i--) {
			bff.append(str.charAt(i));
		}
		
		System.out.println(bff);
		
	}
	
	
	



	public static void nextOne() {

		String[] sec1 = {"w", "g", "b", "w", "w", "r"};
		String[] sec2 = {"b", "r", "r", "o", "w", "w"};

		//Get the section color count
		Map<String, Integer> sec1Count = getCount(sec1);
		Map<String, Integer> sec2Count = getCount(sec2);

		for(Map.Entry<String, Integer> e : sec1Count.entrySet()) {

			if(sec2Count.get(e.getKey()) != null) {

				if( sec1Count.get(e.getKey()) >= sec2Count.get(e.getKey()))
				{
					System.out.println("number of pairs possible for " + e.getKey() + " is :" + sec2Count.get(e.getKey()));
				}
				else
				{
					System.out.println("number of pairs possible for " + e.getKey() + " is :" + sec1Count.get(e.getKey()));
				}
			}
			else
			{
				System.out.println("number of pairs possible for " + e.getKey() + " is : 0");
			}
		}
	}

	public static Map<String, Integer> getCount(String[] arr){

		Map<String, Integer> map = new HashMap<>();

		for(int i=0 ; i<arr.length; i++) {

			if(map.get(arr[i]) != null) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}

		return map;
	}


	public static void selectCommonRepeatingVar() {
		String[] arr = {"fruit", "frui", "fruiti", "fruitful"};

		Arrays.sort(arr);

		StringBuilder str = new StringBuilder();
		StringBuilder temp = new StringBuilder();

		for(int i=0;i<arr.length-1;i++) {
			char[] firstEle = arr[i].toCharArray();
			char[] secondEle = arr[i+1].toCharArray();

			str = getRepeatingChar(firstEle, secondEle);

			if(i==0) {
				temp=str;
			}
			else if(str.length()<temp.length()) {
				temp = str;
			}
		}

		System.out.println("Longest repeating string from the array is: " + temp);
	}


	public static StringBuilder getRepeatingChar(char[] firstEle, char[] secondEle) {

		StringBuilder str = new StringBuilder();

		for(int j=0;j<firstEle.length;j++) {
			if(firstEle[j] == secondEle[j]) {
				str.append(firstEle[j]);
			}
			else {
				break;
			}
		}
		return str;	
	}



}
