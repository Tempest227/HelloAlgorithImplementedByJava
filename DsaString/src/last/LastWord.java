package last;

public class LastWord {

	public static void main(String[] args) {
		/*给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。
		如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。*/
		/*输入: "Hello World" 
	           输出: 5*/
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
