package testing;

public class LongestSubStringWithoutRepeatingChar {

	public static void main(String[] args) {

		String s = "abcabcbb";
		StringBuilder sub = new StringBuilder();

		for(int i=0;i<s.length();i++) {
			String t = "";

			for(int j=i;j<s.length();j++) {

				String ct = Character.toString(s.charAt(j));

				if(!t.contains(ct)) 
				{
					t = t.concat(ct);
				}
				else {
					break;
				}
			}
			
			if(t.length()>sub.length()) {
				sub.delete(0, sub.length());
				sub.append(t);
			}

		}
		
		System.out.println("Longest First Substing is '" + sub.toString() + "' And the length is " + sub.length());



	}

}
