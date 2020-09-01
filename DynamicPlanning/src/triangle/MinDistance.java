package triangle;


public class MinDistance {
		//给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
		/*	[
		     [2],
		    [3,4],
		   [6,5,7],
		  [4,1,8,3]
		]*/
	public static void main(String[] args) {
		int[][] arr = {{2},{3,4},{6,5,7},{4,1,8,3}};
		
		System.out.println(minDist(arr));
	}
	
	public static int minDist(int[][] arr){
		int len = arr.length;
		int res;
		
		if (len < 1){
			return 0;
		}
		if (len == 1){
			return arr[0][0];
		}
		
		arr[1][0] = arr[0][0] + arr[1][0];
		arr[1][1] = arr[0][0] + arr[1][1];
		
		
		for (int i=2;i<arr.length;i++){
			for (int j=0;j<arr[i].length;j++){
				if (j == 0){
					arr[i][j] = arr[i-1][0] + arr[i][j];
				}else if (j == arr[i].length - 1){
					arr[i][j] = arr[i-1][arr[i-1].length-1] + arr[i][j];
				}else{
					arr[i][j] = min(arr[i-1][j] , arr[i-1][j-1])+arr[i][j]; 
				}				
			}			
		}
		res = arr[arr.length-1][0];
		for (int i:arr[arr.length-1]){
			res = min(res,i);
		}
		
		
		return res;
	}
	
	public static int min(int a,int b){
		return a<b?a:b;
	}

}
