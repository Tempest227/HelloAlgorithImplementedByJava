package roating;

public class ArrayRoating {

	public static void main(String[] args) {
		/*ÊäÈë: [1,2,3,4,5,6,7] ºÍ k = 3
		   Êä³ö: [5,6,7,1,2,3,4]*/
		int[] arr = {1,2,3,4,5,6,7};
	
		test(arr,3);
		
		
	}
	
	public static int[] test(int[] arr,int k){
		int[] newPos = new int[arr.length];
		int[] newArr = new int[arr.length];
		for (int i=0;i<arr.length;i++){
			newPos[i] = (i+k)%(arr.length);
			newArr[newPos[i]] = arr[i];
		}
		return newArr;
	}
	
	public static void swap(int a,int b){
		int tmp;
		
	}

}
