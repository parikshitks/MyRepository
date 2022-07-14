package testing;

public class Print1to100UsingRecursion {

	public static void main(String[] args) {
		

		printValues(8);
	}
	
	public static void printValues(int n) {
		
		if(n==1) {
			System.out.println(1);
			return;
		}
		else {
			printValues(n-1);
			System.out.println(n);
		}
	}

}
