package remove;

import java.util.Arrays;

public class Remove1 {

	public static void main(String[] args) {
		/*���� nums = [3,2,2,3], val = 3,
		����Ӧ�÷����µĳ��� 2, ���� nums �е�ǰ����Ԫ�ؾ�Ϊ 2��
		�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�*/
		int[] arr = {3,2,2,3};
		System.out.println(newLen(arr,3));
		System.out.println(Arrays.toString(arr));

	}
	
	public static int newLen(int[] arr,int val){
		int i = 0;
		
		for (int j=0;j<arr.length;j++){
			if (arr[j]!=val){
				arr[i] = arr[j];
				i++;
			}
		}
		return i;
	}

}
