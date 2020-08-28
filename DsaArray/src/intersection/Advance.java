package intersection;

import java.util.ArrayList;


public class Advance {

	public static void main(String[] args) {
		int[] nums1 = {4,5,9}, nums2 = {9,9,8,4,4};
		int[] nums3 = {4,4,8,9,9};
		//System.out.println("nums1: "+order(nums1)+"\t nums2: "+order(nums2));
		System.out.println(test(nums1,nums3));
	}
	
	
	
	public static ArrayList<Integer> test(int[] arr1,int[] arr2){			
		int minLen = (arr1.length<arr2.length)?arr1.length:arr2.length;
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		for (int i=0,j=0;i<minLen;i++,j++){
			if (arr1[i] == arr2[j]){
				res.add(arr1[i]);
			}else if(arr1[i] < arr2[j]){
				i++;
			}else{
				j++;
			}
		}
		return res;
	}
}
