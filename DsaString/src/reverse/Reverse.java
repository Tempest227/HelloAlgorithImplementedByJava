package reverse;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		/*
		 * ÊäÈë£º["h","e","l","l","o"]
		    Êä³ö£º["o","l","l","e","h"]*/
		//char[] chars = {'h','e','l','l','o'};
		char[] chars = {'f','u','c','k','e','d'};
		reverseString(chars);
		System.out.println(Arrays.toString(chars));
	}
	
	public static void reverseString(char[] arr){		
		char tmp;
		
		for (int i=0;i<arr.length/2;i++){			
				tmp = arr[i];
				arr[i] = arr[arr.length-1-i];
				arr[arr.length-1-i] = tmp;
		}
	}

}
