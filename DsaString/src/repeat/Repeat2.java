package repeat;

public class Repeat2 {

	public static void main(String[] args) {
		String s = "leetcode";
		s = "loveleetcode";
		System.out.println(firstUniqChar(s));
	}

	public static int firstUniqChar(String s){
		int[] arr = new int[26];
		char[] chars = s.toCharArray();
		for (int i=0;i<chars.length;i++){
			arr[chars[i]-'a'] = i;
		}
		for (int i=0;i<chars.length;i++){
			if (arr[chars[i]-'a'] == i){
				return i;
			}else{
				arr[chars[i]-'a']  = -1;
			}
		}
		
		return -1;
	}
}
