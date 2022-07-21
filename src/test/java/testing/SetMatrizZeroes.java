package testing;

import java.util.ArrayList;
import java.util.List;

public class SetMatrizZeroes {

	public static void main(String[] args) {
		
		int[][] arr = {{7,19,2},{4,21,0}};
		int[][] arr1 = arr.clone();
		
		List<Integer> lst = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(containsZero(arr[i])) {
				lst.addAll(getAllZeroClm(arr[i]));
				for(int j=0;j<arr.length;j++) {
					arr1[i][j]=0;
				}
				
			}
		}
		
		System.out.println("test");
		
		for(int e: lst) {
			for(int i=0;i<arr.length;i++) {
				arr1[i][e]=0;
			}
		}
		
		printArr(arr1);

	}
	
	
	public static void printArr(int[][] arr) {
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(" ");
			for(int j=0;j<arr[0].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
	}
	
	public static List<Integer> getAllZeroClm(int[] arr){
		
		List<Integer> lst = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				lst.add(i);
			}
		}	
		
		return lst;
		
	}
	
	
	public static boolean containsZero(int[] arr) {

		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				return true;
			}
		}		
		return false;	
	}

}
