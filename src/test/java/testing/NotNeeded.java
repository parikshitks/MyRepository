package testing;

import java.util.ArrayList;
import java.util.List;

public class NotNeeded {

	public static void main(String[] args) {
		//int[][] arr = {{7,19,2},{4,21,0}};
		//int[][] arr = {{1,2,3},{4,0,6}, {7,8,9}};
		//int[][] arr = {{1,0},{2,7}, {3,0}, {4,8}};
		int[][] arr = {{0, 69, 0, 41, 0, 2, 59, 94, 3, 65, 2, 16, 0, 59, 48, 38, 99, 15, 75, 62}};
		
		setZeros(arr);
	}
	
	
	public static void optimalApproach(int arr[][]) {
		
		for(int i=1;i<arr.length;i++) {
			for(int j=1;j<arr[0].length;j++) {				
				if(arr[i][j]==0) {
					arr[0][i]=0;
					arr[j][0]=0;
				}
			}
		}
		
		
		
	}
	

	    public static void setZeros(int arr[][]) {
	        int[][] arr1 = arr.clone();
	        
	        List<Integer> lst = new ArrayList<>();
	        
	        for(int i=0;i<arr.length;i++) {
	            if(containsZero(arr[i])) {
	                lst.addAll(getAllZeroClm(arr[i]));
	                for(int j=0;j<arr[0].length;j++) {
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
	        arr = arr1;
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

