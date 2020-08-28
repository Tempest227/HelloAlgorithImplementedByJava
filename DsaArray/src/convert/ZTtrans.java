package convert;

import java.util.Arrays;

public class ZTtrans {

	public static void main(String[] args) {
		/* ‰»Î: s = "LEETCODEISHIRING", numRows = 3
		 ‰≥ˆ: "LCIRETOESIIGEDHN"*/
		String s = "LEETCODEISHIRING";
		System.out.println(convert(s,3));
	}
	
	public static String convert(String s,int numRows){
		String[] arr = new String[numRows];
		Arrays.fill(arr, "");
		int len = s.length();
		char[] chars = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		int period = numRows*2-2;
		
		for(int i=0;i<len;i++){
			int mod = i%period;
			if (mod<numRows){
				arr[mod]+=chars[i];				
			}else{
				arr[period-mod]+=chars[i];
			}
			
		}
		for(String ch:arr){
			sb.append(ch);
		}
		return sb.toString();
	}

}
