package min;

public class MinDist {

	public static void main(String[] args) {
		//����һ�������Ǹ������� m x n �������ҳ�һ�������Ͻǵ����½ǵ�·����ʹ��·���ϵ������ܺ�Ϊ��С��
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
