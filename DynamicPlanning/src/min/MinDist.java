package min;

public class MinDist {

	public static void main(String[] args) {
		//给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
		int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
		
		System.out.println(minDist(arr));

	}
	
	public static int minDist(int[][] arr){
		int len = arr.length;
		for (int i=0;i<arr.length;i++){
			for (int j=0;j<arr[i].length;j++){
				if (j==0&&i!=0){
					arr[i][j] = arr[i-1][j] + arr[i][j];
				}else if(i==0&&j!=0){
					arr[i][j] = arr[i][j-1] + arr[i][j];
				}else if (i!=0&&j!=0){
					arr[i][j] = min(arr[i-1][j],arr[i][j-1]) + arr[i][j];
				}
			}
		}
		return arr[len-1][arr[len-1].length-1];
	}
	
	public static int min(int a,int b){
		return a<b?a:b;
	}

}
