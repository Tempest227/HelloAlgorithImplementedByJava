package repeat;

import java.util.HashMap;

public class Repeat {

	public static void main(String[] args) {
		String s = "leetcode";
		s = "loveleetcode";
		System.out.println(find(s));
	}
	
	public static int find(String s){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();		
		int val = 0;
		char[] chars = s.toCharArray();
		
		for (int i=0;i<chars.length;i++){				
			if (!map.containsKey(chars[i])){
				map.put(chars[i], 1);
			}else{
				val = map.get(chars[i])+1;
				map.put(chars[i], val);
			}			
		}
		for (int i=0;i<chars.length;i++){
			if (map.get(chars[i]) == 1){
				return i;
			}
		}
		
		return -1;
	}

}
