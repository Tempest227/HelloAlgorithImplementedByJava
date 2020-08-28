package roating;

import java.util.Arrays;

public class ArrayRoating2 {

	public static void main(String[] args) {
		/*ÊäÈë: [1,2,3,4,5,6,7] ºÍ k = 3
		   Êä³ö: [5,6,7,1,2,3,4]*/
		int[] arr = {1,2,3,4,5,6,7};
	
		rotate(arr,3);
		System.out.println(arr);

	}
	public static void rotate(int[] arr,int k){
		reverse(arr,0,arr.length);
		reverse(arr,0,k%arr.length);
		reverse(arr,k%arr.length,arr.length+k);
	}
	
	public static void reverse(int[] arr,int start,int len){
		int tmp = 0;
		
		for (int i=start;i<len/2;i++){
			tmp = arr[i];
			arr[i] = arr[len-1-i];
			arr[len-1-i] = tmp;
		}
	}

}
