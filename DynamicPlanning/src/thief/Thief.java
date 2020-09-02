package thief;

public class Thief {

	public static void main(String[] args) {
		/*你是一个专业的小偷，计划偷窃沿街的房屋。
		 * 每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
		 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
		 */
		
/*		输入: [1,2,3,1]
		输出: 4
		解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
			 偷窃到的最高金额 = 1 + 3 = 4 。*/
		int[] arr = {1,2,3,1};
		
		System.out.println(getMoney(arr));
	}
	
	public static int getMoney(int[] arr){
		arr[1] = max(arr[0],arr[1]);
		for (int i=2;i<arr.length;i++){
			arr[i] = max(arr[i-1],arr[i]+arr[i-2]);
		}
		return arr[arr.length-1];
	}
	
	public static int max(int a,int b){
		return a>b?a:b;
	}

}
