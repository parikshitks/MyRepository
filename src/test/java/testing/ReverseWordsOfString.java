package testing;

public class ReverseWordsOfString {

	public static void main(String[] args) {


		String s = "Testing";
		StringBuffer bf  = new StringBuffer(s);
		
		int l = bf.length()-1;
		
		for(int j=0;j<bf.length()/2;j++) {
			String temp=Character.toString(bf.charAt(j));
			bf.replace(j,j+1, Character.toString(bf.charAt(l)));
			bf.replace(l, l+1, temp);
			l--;
		}
		System.out.println(bf);
	}

}
