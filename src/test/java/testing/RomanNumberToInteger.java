package testing;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberToInteger {
	
	
	public static void main(String[] args) {
		
		 HashMap<String, Integer> conv = new HashMap<>();
	        conv.put("M", 1000);
	        conv.put("D", 500);
	        conv.put("C", 100);
	        conv.put("L", 50);
	        conv.put("X", 10);
	        conv.put("V", 5);
	        conv.put("I", 1);
	        conv.put("IV", 4);
	        conv.put("IX", 9);
	        conv.put("XL", 40);
	        conv.put("XC", 90);
	        conv.put("CD", 400);
	        conv.put("CM", 900);
	        conv.put("", 0);
	        
		System.out.println(romanToInt("XXIII", conv));
	}
	
	
	
	
	
	
	public static int romanToInt(String s, Map<String, Integer>  m) {
		
		
		if(s.length()<=1) {
			return m.get(s);
		}
		
		String sub = s.substring(0,2);
		
		if(m.containsKey(sub)) {
			return m.get(sub) + romanToInt(s.substring(2,s.length()), m);
		}
		else {
			return m.get(s.substring(0,1)) + romanToInt(s.substring(1,s.length()),m);
		}
	
	}

}

