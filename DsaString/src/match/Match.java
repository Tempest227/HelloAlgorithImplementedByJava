package match;

public class Match {

	public static void main(String[] args) {
		/*ʵ�� strStr() ����������һ�� haystack �ַ�����һ�� needle �ַ�����
		�� haystack �ַ������ҳ� needle �ַ������ֵĵ�һ��λ�� (��0��ʼ)��
		��������ڣ��򷵻� -1��*/
		
		/*����: haystack = "hello", needle = "ll"
		���: 2*/
		
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
