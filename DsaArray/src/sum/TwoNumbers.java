package sum;

import java.util.HashMap;

public class TwoNumbers {

	public static void main(String[] args) {
		/*给定 nums = [2, 7, 11, 15], target = 9
		因为 nums[0] + nums[1] = 2 + 7 = 9
		所以返回 [0, 1]*/
		int[] nums = {2, 7, 11, 15};
		sum(nums,9);
		

	}
	
	public static int[] sum(int[] arr,int target){
		HashMap<Integer, Integer> map = new HashMap();
		int mark = 0,key = 0;
		for (int i=0;i<arr.length;i++){
			int c = target - arr[i];
			if (map.containsKey(c)){
				mark = i;
				key = c;
				break;
			}
			map.put(arr[i], i);
		}
		return new int[]{map.get(key),mark};
	}

}
