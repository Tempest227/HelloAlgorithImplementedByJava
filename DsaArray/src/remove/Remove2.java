package remove;

import java.util.Arrays;

public class Remove2 {

	public static void main(String[] args) {
		/*���� nums = [0,0,1,1,1,2,2,3,3,4],
		 ����Ӧ�÷����µĳ��� 5, ����ԭ���� nums ��ǰ���Ԫ�ر��޸�Ϊ 0, 1, 2, 3, 4��
		 �㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�*/
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
