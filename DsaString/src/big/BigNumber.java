package big;

import java.util.Arrays;

public class BigNumber {

	public static void main(String[] args) {
		//输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。

		
		System.out.println(Arrays.toString(print(2)));
	}
	
	public static int[] print(int n){
		
		int max = (int)Math.pow(10,n);
		int[] res = new int[max];
		
		for (int i=0;i<max;i++){
			res[i] = i;
		}
		
		return res;
	}

}
