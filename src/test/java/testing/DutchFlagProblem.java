package testing;

public class DutchFlagProblem {

	public static void main(String[] args) {
		
		int[] ar = {1,2,1,1,1,0,0,2,0,1,0,0};
		
		
		int s = 0;
		int m = 0;
		int l = ar.length-1;
		
		while(m<l) {
			
			switch(ar[m]) {
			
			case 0:
				swap(ar, s, m);
				m++;
				s++;
				break;
			case 1:
				m++;
				break;
			case 2:
				swap(ar, l, m);
				l--;
				break;
			}
		}
		printArr(ar);
	}
	
	public static void printArr(int[] ar) {
		
		for(int e: ar) {
			System.out.println(e);
		}		
	}
	
	
	public static void swap(int[] ar, int s, int m) {		
		int temp = ar[s];
		ar[s] = ar[m];
		ar[m] = temp;
	}

}
