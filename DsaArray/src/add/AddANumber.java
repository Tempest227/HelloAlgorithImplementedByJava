package add;

import java.util.ArrayList;
import java.util.Arrays;

public class AddANumber {

	public static void main(String[] args) {
		/*
		输入: [1,2,3]
		输出: [1,2,4]
		解释: 输入数组表示数字 123
		
		输入 99   输出 100
		输入 199 输出 200
		*/
		int[] arr = {9,9};
		//int[] arr = {1,9,9};
		//int[] arr = {2,8,8};
		add(arr);

	}
	public static int[] add(int[] arr){
		int carry = 0;
		int[] arr1 = new int[arr.length+1];
		for (int i=arr.length-1;i>=0;i--){
			if (carry > 0){
				if (arr[i] == 9){
					arr[i] = 0;
					carry+=1;
				}else{
					arr[i]+=1;
					carry-=1;
				}
			}else if(i==arr.length-1){
				if (arr[i] == 9){
					arr[i] = 0;
					carry+=1;
				}else{
					arr[i]+=1;
				}
			}else{
				
			}
		}
		if (carry >= arr.length){
			arr1[0] = 1;
			for (int i=1;i<arr.length-1;i++){
				arr1[i] = arr[i-1];
			}
		}
		return arr1;
		
	}

}
