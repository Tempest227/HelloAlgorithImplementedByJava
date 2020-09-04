package big;

import java.util.Arrays;

public class Advance {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(print(2)));
	}
	
	public static int[] print(int n){
		int max = 1;
		
		
		while(n>0){
			max = 10*max;
			n--;
		}
		int[] res = new int[max];
		for (int i=0;i<max;i++){
			res[i] = i;
		}
		return res;
	}

}
