package remove;

import java.util.Arrays;

public class RemoveInOriginalArray {

	public static void main(String[] args) {
		/*���� nums = [3,2,2,3], val = 3,
		����Ӧ�÷����µĳ��� 2, ���� nums �е�ǰ����Ԫ�ؾ�Ϊ 2��
		�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�*/
		
		int[] arr = {3,2,2,3};
		System.out.println(newLen(arr,3));
		System.out.println(Arrays.toString(arr));

	}
	
	public static int newLen(int[] arr,int val){
		int len = 0;
		
		for (int i=0;i<arr.length;i++){
			if (arr[i] == val){
				len++;
			}else{
				if (i!=0){
					arr[i-len] = arr[i]; 
				}
			}
		}
		return len;
	}

}
