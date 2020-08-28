package remove;

import java.util.Arrays;

public class Remove2 {

	public static void main(String[] args) {
		/*给定 nums = [0,0,1,1,1,2,2,3,3,4],
		 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
		 你不需要考虑数组中超出新长度后面的元素。*/
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		
		System.out.println(remove(arr));
		System.out.println(Arrays.toString(arr));		
	}
	
	public static int remove(int[] arr){
		int i = 0;
		
		for (int j=i+1;j<arr.length;j++){
			if (arr[i] == arr[j]){
				arr[i] = arr[j];
			}else{
				i++;
				arr[i] = arr[j];
			}
		}
		
		return i+1;
	}

}
