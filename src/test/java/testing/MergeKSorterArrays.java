package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeKSorterArrays {

	public static void main(String[] args) {
		
		int[][] arr = {{1,4,5}, {1,3,4}, {2,6}};
		List<Integer> finalArr = new LinkedList<>();
		
		List<int[]> list = new ArrayList<>(Arrays.asList(arr));
		
		for(int i=0;i<list.size();i++)
		{
			int[] a = list.get(i);
			for(int j=0;j<a.length;j++) {
				finalArr.add(a[j]);
			}
			
		}
		Collections.sort(finalArr);
		System.out.println(finalArr);
		

	}
	

}
