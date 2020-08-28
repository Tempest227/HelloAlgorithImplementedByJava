package intersection;

import java.util.ArrayList;

public class Intersection2 {

	public static void main(String[] args) {
		int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
		int[] res = test(nums1,nums2);

	}
	public static int[] test(int[] arr1,int[] arr2){
		int[] book = new int[max(arr1,arr2)+1];
		int k=0;
		
		
		for (int i=0;i<arr1.length;i++){
			book[arr1[i]]+=1;
		}
		for (int j=0;j<arr2.length;j++){
			if (book[arr2[j]]>0){
				book[arr2[j]]-=1;
				arr2[k]=arr2[j];
				k++;
			}
		}
		int[] arr3 = new int[k];
		for (int i=0;i<k;i++){
			arr3[i] = arr2[i];
		}
		
		return arr3;
	}
	public static int max(int[] arr1,int[] arr2){
		int m=0;
		for (int i=0;i<arr1.length;i++){
			if (m < arr1[i]){
				m = arr1[i];
			}
		}
		for (int i=0;i<arr2.length;i++){
			if (m < arr2[i]){
				m = arr2[i];
			}
		}
		return m;
	}

}
