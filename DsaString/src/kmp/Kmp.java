package kmp;

public class Kmp {

	public static void main(String[] args) {
		

	}
	
	public static int kmpSearch(String target,String pattern){
		
		int i = 0;
		int j = 0;
		int sLen = target.length();
		int pLen = pattern.length();
		int[] next = getNext(pattern);
		while (i < sLen && j < pLen)
		{
			//�����j = -1�����ߵ�ǰ�ַ�ƥ��ɹ�����S[i] == P[j]��������i++��j++    
			if (j == -1 || target.toCharArray()[i] == pattern.toCharArray()[j])
			{
				i++;
				j++;
			}
			else
			{
				//�����j != -1���ҵ�ǰ�ַ�ƥ��ʧ�ܣ���S[i] != P[j]�������� i ���䣬j = next[j]    
				//next[j]��Ϊj����Ӧ��nextֵ      
				j = next[j];
			}
		}
		if (j == pLen)
			return i - j;
		else
			return 0;
	}
	
	public static int[] getNext(String pattern){
		int len = pattern.length();
		char[] p = pattern.toCharArray();
		int[] next = new int[len];
		next[0] = -1;
		int k = -1;
		int j = 0;
		
		while(j<len-1){
			if (k==-1||p[j]==p[k]){
				++k;
				++j;
				next[j] = k;
			}else{
				k = next[k];
			}
		}
		return next;	
	}

}
