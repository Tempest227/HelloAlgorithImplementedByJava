package sub;

public class MaxSubArr {

	public static void main(String[] args) {
		//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
		/*输入: [-2,1,-3,4,-1,2,1,-5,4],
		输出: 6
		解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。*/
		
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println(maxSubArray(arr));
	}
	
	public static int maxSubArray(int[] arr){
		int[] dp = new int[arr.length];
		dp[0] = arr[0];
		int max = dp[0];
		
		for (int i=1;i<dp.length;i++){
			if (dp[i-1]<0){
				dp[i] = arr[i];
			}else{
				dp[i] = arr[i]+dp[i-1];
			}
			max = (max>dp[i])?max:dp[i];
		}
		return max;
	}

}
