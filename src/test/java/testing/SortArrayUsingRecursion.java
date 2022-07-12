package testing;

import java.util.ArrayList;
import java.util.List;

public class SortArrayUsingRecursion {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(5);
		arr.add(3);
		arr.add(7);
		arr.add(32);
		arr.add(4);
		arr.add(8);
		
		sort(arr);
		System.out.println(arr);

	}
	
	public static List<Integer> sort(List<Integer> arr)
	{		
		if(arr.size()==0) {
			return arr;
		}
		else
		{
			int t = arr.get(arr.size()-1);
			arr.remove(arr.size()-1);
			sort(arr);
			return insert(arr, t);
		}
	}
	
	public static List<Integer> insert(List<Integer> arr, int t) {
		
		if(arr.size()==0|| t>arr.get(arr.size()-1)) {
			arr.add(t);
			return arr;
		}
		else {
			int tmp = arr.get(arr.size()-1);
			arr.remove(arr.size()-1);
			insert(arr,t);
			arr.add(tmp);
			return arr;
		}
		
		
	}
	
	

}
