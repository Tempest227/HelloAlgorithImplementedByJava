package big;

import java.util.Arrays;

public class BigNumber {

	public static void main(String[] args) {
		//�������� n����˳���ӡ���� 1 ������ n λʮ���������������� 3�����ӡ�� 1��2��3 һֱ������ 3 λ�� 999��

		
		System.out.println(Arrays.toString(print(2)));
	}
	
	public static int[] print(int n){
		
		int max = (int)Math.pow(10,n);
		int[] res = new int[max];
		
		for (int i=0;i<max;i++){
			res[i] = i;
		}
		
		return res;
	}

}
