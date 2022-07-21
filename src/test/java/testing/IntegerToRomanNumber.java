package testing;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRomanNumber {

	public static void main(String[] args) {

		int i = 663;

		HashMap<Integer, String> conv = new HashMap<>();
		conv.put(1000, "M");
		conv.put(500, "D");
		conv.put(100, "C");
		conv.put(50, "L");
		conv.put(10, "X");
		conv.put(5, "V");
		conv.put(1, "I");
		conv.put(4, "IV");
		conv.put(9, "IX");
		conv.put(40, "XL");
		conv.put(90, "XC");
		conv.put(400, "CD");
		conv.put(900, "CM");
		conv.put(0, "");


		System.out.println(printString(i, conv));
	}

	public static String printString(int i, Map<Integer, String> m) {

		if(i/1000>=1) {
			return m.get(1000) + printString(i%1000, m);
		}
		else if(i/500>=1) {
			return m.get(500) + printString(i%500, m);
		}
		else if(i/400>=1) {
			return m.get(400) + printString(i%400, m);
		}
		else if(i/100>=1) {
			return m.get(100) + printString(i%100, m);
		}
		else if(i/50>=1) {
			return m.get(50) + printString(i%50, m);
		}
		else if(i/10>=1) {
			return getConctString(m.get(10), i/10) + printString(i%10, m);
		}
		else {
			if(m.containsKey(i)) {
				return m.get(i);
			}
			else {
				return "I" + printString(i-1, m);
			}
		}

	}

	public static String getConctString(String printVal, int n) {

		StringBuffer f = new StringBuffer();


		for(int i=0;i<n;i++) {
			f.append(printVal);
		}

		return new String(f);
	}



}
