package prefix;

public class CommonPrefix {

	public static void main(String[] args) {
		/*
		输入: ["flower","flow","flight"]
		输出: "fl"
		
		输入: ["dog","racecar","car"]
		输出: ""
		*/
		//String[] arr = {"flower","flow","flight"};
		String[] arr = {"dog","racecar","car"};		
		test(arr);
	}
	
	public static void test(String[] arr){		
		int minLen = minStringLen(arr);		
		String[] c = new String[arr.length];
		
		for (int i=0;i<arr.length;i++){
			c[i] = arr[i];
		}
		
		char[] c1 = c[0].toCharArray();
		int[] book = new int[minLen];
		for (int i=1;i<arr.length;i++){
			for (int j=0;j<minLen;j++){
				if (c1[j]==arr[i].toCharArray()[j]){
					book[j]+=1;
				}else{
					book[j]-=1;
				}
			}
		}
		print(book,arr);
	}
	public static void print(int[] book,String[] arr){
		int cnt=0;
		for (int i=0;i<book.length;i++){
			if (book[i] > 0){
				System.out.print(arr[0].toCharArray()[i]);
				cnt += 1;
			}else{
				
			}
		}
		if (cnt == 0){
			System.out.println("\"\"");
		}
	}
	public static int minStringLen(String[] arr){
		int min = arr[0].length();
		for (int i=1;i<arr.length;i++){
			if (min > arr[i].length()){
				min = arr[i].length();
			}
		}
		return min;
	}

}
