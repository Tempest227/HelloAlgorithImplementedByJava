package stairs;

public class ClimbStairs {

	public static void main(String[] args) {
		/*������������¥�ݡ���Ҫ n ������ܵ���¥����
		ÿ��������� 1 �� 2 ��̨�ס�
		���ж����ֲ�ͬ�ķ�����������¥���أ�
		ע�⣺���� n ��һ����������*/
		
		/*���룺 2   ����� 2  ���ͣ� �����ַ�����������¥����
		1.  1 �� + 1 ��
		2.  2 ��*/
		
		System.out.println(climbStairs(5));

	}
	
	public static int climbStairs(int n){		
		if (n == 0){
			return 0;
		}
		if (n == 1){
			return 1;
		}
		if (n == 2){
			return 2;
		}
		return climbStairs(n-1) + climbStairs(n-2);
	}

}
