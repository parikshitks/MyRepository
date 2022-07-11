package testing;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		
		int[] a1 = {1,3,5};
		int[] a2 = {2,3,4};
		
		int l = a1.length+a2.length;
		int[] fn = new int[l];
		
		System.arraycopy(a1, 0, fn, 0, a1.length);
		System.arraycopy(a2, 0, fn, a1.length, a2.length);
        Arrays.sort(fn);
		
		double m=fn[(l-1)/2];
		
		if(fn.length%2==0) {
			m =  fn[(l-1)/2] + fn[((l-1)/2)+1];
			System.out.println(m/2);
		}
        
		
	}

}
