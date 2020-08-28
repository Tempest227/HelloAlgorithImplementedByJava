package stock;

import java.util.ArrayList;

public class StockProfit {

	public static void main(String[] args) {
		/*输入: [7,1,5,3,6,4]   
				输出: 7	
		输入: [1,2,3,4,5]		
				输出: 4
		输入: [7,6,4,3,1]       
				输出: 0*/
		//int[] arr = {1,2,3,4,5};
		//int[] arr = {7,6,4,3,1};
		int[] arr = {7,1,5,3,6,4};
		System.out.println(test(arr));

	}
	
	public static int test(int[] arr){
		int r1 = strategy1(arr);
		int r2 = strategy2(arr);
		int res = 0;
		
		res = r1>r2?r1:r2;
		if (r1 == r2)
			res = r1;
		
		return res;
	}
	public static int strategy2(int[] arr){
		int res = 0;
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		for (int i=0;i<arr.length-1;i++){
			if (arr[i]<arr[i+1]){
				alist.add(arr[i]);
				alist.add(arr[i+1]);
			}else{
				
			}
		}
		for (int i=0;i<alist.size();i+=2)
			res += -1*(int)alist.toArray()[i]+(int)alist.toArray()[i+1];
		return res;
	}
	public static int strategy1(int[] arr){
		int res = 0;
		int max,pMax = 0;
		int flag = 0;
		ArrayList<Integer> alist = new ArrayList<Integer>();
		
		for (int i=0;i<arr.length;){
			max = 0;
			for (int j=i+1;j<arr.length;j++){
				if (arr[j] > arr[i]){
					max = (max>arr[j])?max:arr[j];
					pMax = j;
					flag = 1;
				}else{
					
				}
			}
			if (flag == 1){
				alist.add(arr[i]);
				alist.add(max);
			}
				
			if (pMax == arr.length-2){
				break;
			}else{
				i = pMax+1;
				pMax++;
			}
		}
		
		for (int i=0;i<alist.size();i+=2)
			res += -1*(int)alist.toArray()[i]+(int)alist.toArray()[i+1];
		
		return res;
	}
}


