package last;

public class LastWord {

	public static void main(String[] args) {
		/*����һ����������Сд��ĸ�Ϳո� ' ' ���ַ��� s�����������һ�����ʵĳ��ȡ�
		����ַ����������ҹ�����ʾ����ô���һ�����ʾ��������ֵĵ��ʡ�*/
		/*����: "Hello World" 
	           ���: 5*/
		String s = "Hello World";
		String[] strArr = s.split(" ");
		System.out.println(strArr[strArr.length-1].length());
		

	}
	
	public static int lenOfLastWord(String s){
		if (s == null || s.length() == 0) {
			return 0;
		}
		int cnt = 0;
		
		for (int i=s.length()-1;i>=0;i--){
			if (s.charAt(i)==' '){
				if (cnt == 0){
					continue;
				}
				break;
			}
			cnt++;
		}
		return cnt;
	}

}
