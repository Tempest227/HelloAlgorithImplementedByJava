package match;

public class Match {

	public static void main(String[] args) {
		/*实现 strStr() 函数。给定一个 haystack 字符串和一个 needle 字符串，
		在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。
		如果不存在，则返回 -1。*/
		
		/*输入: haystack = "hello", needle = "ll"
		输出: 2*/
		
		String h = "hello";
		String n = "ll";
		
		System.out.println(strStr(h,n));


	}
	
	public static int strStr(String haystack,String needle){
		char[] t = haystack.toCharArray();
		char[] p = needle.toCharArray();
		int lenOfPattern = needle.length();
		int lenOfTarget = haystack.length();
		int[] shift = new int[26];
		
		if (needle.isEmpty()){
			return 0;
		}
		
		for (int i=0;i<shift.length;i++){
			shift[i] = lenOfPattern + 1;
		}
		for (int i=0;i<lenOfPattern;i++){
			shift[p[i]-'a'] = lenOfPattern - i;
		}
		
		int s = 0;
		int j;
		
		while(s <= lenOfTarget - lenOfPattern){
			j = 0;
			while(t[s+j] == p[j]){
				j++;
				if (j==lenOfPattern){
					return s;
				}
			}
			s += shift[t[s+lenOfPattern]-'a'];
		}
		return -1;
	}

}
