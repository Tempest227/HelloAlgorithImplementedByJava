package sub;

public class MaxSubArr {

	public static void main(String[] args) {
		//����һ���������� nums ���ҵ�һ���������͵����������飨���������ٰ���һ��Ԫ�أ������������͡�
		/*����: [-2,1,-3,4,-1,2,1,-5,4],
		���: 6
		����: ���������� [4,-1,2,1] �ĺ����Ϊ 6��*/
		
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
