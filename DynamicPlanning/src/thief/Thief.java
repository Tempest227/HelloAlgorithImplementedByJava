package thief;

public class Thief {

	public static void main(String[] args) {
		/*����һ��רҵ��С͵���ƻ�͵���ؽֵķ��ݡ�
		 * ÿ�䷿�ڶ�����һ�����ֽ�Ӱ����͵�Ե�Ψһ��Լ���ؾ������ڵķ���װ���໥��ͨ�ķ���ϵͳ��
		 * ����������ڵķ�����ͬһ���ϱ�С͵���룬ϵͳ���Զ�������
		 */
		
/*		����: [1,2,3,1]
		���: 4
		����: ͵�� 1 �ŷ��� (��� = 1) ��Ȼ��͵�� 3 �ŷ��� (��� = 3)��
			 ͵�Ե�����߽�� = 1 + 3 = 4 ��*/
		int[] arr = {1,2,3,1};
		
		System.out.println(getMoney(arr));
	}
	
	public static int getMoney(int[] arr){
		arr[1] = max(arr[0],arr[1]);
		for (int i=2;i<arr.length;i++){
			arr[i] = max(arr[i-1],arr[i]+arr[i-2]);
		}
		return arr[arr.length-1];
	}
	
	public static int max(int a,int b){
		return a>b?a:b;
	}

}
