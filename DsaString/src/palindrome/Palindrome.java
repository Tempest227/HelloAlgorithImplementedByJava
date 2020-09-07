package palindrome;

public class Palindrome {

	public static void main(String[] args) {
		//����һ���ַ�������֤���Ƿ��ǻ��Ĵ���ֻ������ĸ�������ַ������Ժ�����ĸ�Ĵ�Сд��
		String s = "he,llo;olleh";
		
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s){
		char[] chars = s.toLowerCase().toCharArray();		
		int j = chars.length - 1;
		int i = 0;
		
		while(i<j){
			if (!((chars[i]>'a'&&chars[i]<'z')||(chars[i]>'0'&&chars[i]<'9'))){
				i++;
				continue;
			}
			if (!((chars[j]>'a'&&chars[j]<'z')||(chars[j]>'0'&&chars[j]<'9'))){
				j--;
				continue;
			}
			if (chars[i]!=chars[j]){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
