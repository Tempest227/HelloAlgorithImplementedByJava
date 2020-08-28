package intersection;

import java.util.ArrayList;

public class Intersection {

	public static void main(String[] args) {
		/*输入: nums1 = [1,2,2,1], nums2 = [2,2]

		    输出: [2,2]*/
		/*输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]

		输出: [4,9]*/
//		int[] nums1 = {1,2,2,1};
//		int[] nums2 = {2,2};
		int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
		
		System.out.println(test(nums1,nums2));
		
	}
	
	public static ArrayList<Integer> test(int[] arr1,int[] arr2){	
		int[] minArr;
		int[] maxArr;
		
		int minLen = (arr1.length < arr2.length)?arr1.length:arr2.length;
		int maxLen = (arr1.length > arr2.length)?arr1.length:arr2.length;
		int[] bookArr1 = new int[maxLen];
		int[] bookArr2 = new int[minLen];
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		if (minLen == arr1.length){
			minArr = arr1;
			maxArr = arr2;
		}else{
			minArr = arr2;
			maxArr = arr1;
		}
		
		for (int i = 0;i < maxArr.length;i++){
			for (int j = 0;j < minArr.length;j++){
				if (minArr[j] == maxArr[i] && bookArr2[j] == 0 && bookArr1[i] == 0){
					bookArr2[j] = 1;
					bookArr1[i] = 1;
					res.add(minArr[j]);
				}
			}
		}
		return res;
	}

}
