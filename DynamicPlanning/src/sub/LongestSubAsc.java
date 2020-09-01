package sub;

public class LongestSubAsc {

	public static void main(String[] args) {
		//给定一个无序的整数数组，找到其中最长上升子序列的长度。
		//设 上升子序列的长度 dp[i]
		int[] arr = {1,9,5,9,3};
		
		System.out.println(lengthOfLIS(arr));
	}
	
	public static int lengthOfLIS(int[] arr){
		int[] dp = new int[arr.length];
		dp[0] = 1;
		int res = 1;
		
		for (int i=1;i<dp.length;i++){			
			for (int j=0;j<i;j++){
				if (arr[j]<arr[i]){
					dp[i] = max(dp[j]+1,1);
					res = max(res,dp[i]);
				}
			}
		}
		return res;
	}
	
	public static int max(int a,int b){
		return a>b?a:b;
	}
}
