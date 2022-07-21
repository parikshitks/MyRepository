package testing;

public class LongestPalindromeSubstring {

	public static void main(String[] args) {


		String string = "teeeetabcdcbaget";

		int temp=1;

		outerloop:
			for(int i=string.length();i>=0;i--) {

				for(int j=0;j<temp;j++) {	

					String sub = string.substring(j,i+j);

					if(sub.equals(palindrome(sub))) 
					{
						System.out.println("Largest palindrome sequence is: " + sub);
						break outerloop;
					}
				}
				temp+=1;
			}
	}



	public static String palindrome(String s) {

		StringBuilder sb = new StringBuilder(s);
		sb.reverse();

		return new String(sb);


	}

}
