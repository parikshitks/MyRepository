package testing;

public class FactorialOfANumberUsingRecursion {

	public static void main(String[] args) {
		
		System.out.println(factorial(8));

	}
	
	
	public static int factorial(int n) {
		
		if(n==1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
		
	}

}
