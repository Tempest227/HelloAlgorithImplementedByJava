package sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumbers {

	public static void main(String[] args) {
		/*给定数组 nums = [-1, 0, 1, 2, -1, -4]，
		满足要求的三元组集合为：
		[
		  [-1, 0, 1],
		  [-1, -1, 2]
		]*/
		int[] nums = {-1, 0, 1, 2, -1, -4};

		System.out.println(sum(nums));

	}
	
	public static List<List<Integer>> sum(int[] nums){
		int left=0,right=0;
		int sum;
		int flag = 0;
		List<List<Integer>> list = new ArrayList<>();
		
		Arrays.sort(nums);
		for (int i=0;i<nums.length-2;i++){
			left = i+1;
			right = nums.length-1;
			sum = nums[i]+nums[left]+nums[right];
			
			
			if (nums[i]>=0){
				continue;
			}
			if (i==0 || nums[i]!=nums[i-1]){
				while(sum!=0){
					if (sum>0){
						right--;
					}else{
						left++;
					}
					sum = nums[i]+nums[left]+nums[right];
					if (right<=left){
						flag = 1;
						break;
					}else{
						
					}
				}
			}
			if (flag == 1){
				flag = 0;
				continue;
			}
			
			list.add(Arrays.asList(nums[i],nums[left],nums[right]));
		}
		return list;
	}

}
