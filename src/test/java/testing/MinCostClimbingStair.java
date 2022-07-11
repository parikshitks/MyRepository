package testing;

public class MinCostClimbingStair {
//Doesn't work for all scenarios currently, the logic is not correct
	public static void main(String[] args) {

		int a[] = { 1,100,1,1,1,100,1,1,100,1 };
		int n = a.length;
		System.out.println(minimumCost(n-2,a));


	}


	// function to find minimum cost
	public static int minimumCost(int n, int cost[]){
		if(n == 0) return cost[0] ;
		if(n == 1) return cost[1] ;
		
		//System.out.println(minimumCost(n-1,cost) + cost[n]);
		//System.out.println(minimumCost(n-2, cost)+ cost[n]);

		int top = Math.min( minimumCost(n-1,cost) + cost[n] ,
				minimumCost(n-2, cost)+ cost[n] );
		return top;
	}



}
