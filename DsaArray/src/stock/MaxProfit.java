package stock;

public class MaxProfit {

	public static void main(String[] args) {
		/*
		 输入: [7,1,5,3,6,4]   
				输出: 7	
		输入: [1,2,3,4,5]		
				输出: 4
		输入: [7,6,4,3,1]       
				输出: 0*/
		int[] arr = {1,2,3,4,5};
		//int[] arr = {7,6,4,3,1};
		//int[] arr = {7,1,5,3,6,4};
		System.out.println(maxProfit(arr));

	}
	
	public static int maxProfit(int[] prices){
		if (prices.length < 2){
			return 0;
		}
		
		int[][] dp = new int[prices.length][2];
		dp[0][0] = 0;
		dp[0][1] = -1*prices[0];
		for (int i=1;i<prices.length;i++){
			dp[i][0] = max(dp[i-1][0],dp[i-1][1]+prices[i]);
			dp[i][1] = max(dp[i-1][0]-prices[i],dp[i-1][1]);
		}
		return dp[prices.length-1][0];
	}
	
	public static int max(int a,int b){
		
		return (a>b)?a:b;
	}

}
