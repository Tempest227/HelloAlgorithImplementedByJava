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
			//①如果j = -1，或者当前字符匹配成功（即S[i] == P[j]），都令i++，j++    
			if (j == -1 || target.toCharArray()[i] == pattern.toCharArray()[j])
			{
				i++;
				j++;
			}
			else
			{
				//②如果j != -1，且当前字符匹配失败（即S[i] != P[j]），则令 i 不变，j = next[j]    
				//next[j]即为j所对应的next值      
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
