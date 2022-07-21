package testing;

public class ArrayPermutationUsingRecursion {

	public static void main(String[] args) {

		String[] arr = {"Test", "Pest", "Hest"};

		printAllPermutations(arr,0);
	}

	public static void printAllPermutations(String[] arr, int index) {
		
		
		if(index==arr.length-1) {
			print(arr);
			return;
		}
		else {
			for(int i=index;i<arr.length;i++) {
				swap(arr, index, i);
				printAllPermutations(arr, index+1);
				swap(arr, index, i);
			}
		}	
	}
	
	public static void print(String[] arr) {
		System.out.println("");
		for(String e: arr) {
			System.out.println(e);
		}
	}
	
	
	public static void swap(String[] arr, int si, int its) {
		
		String temp = arr[si];
		arr[si] = arr[its];
		arr[its] = temp;	
	}


}