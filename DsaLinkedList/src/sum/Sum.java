package sum;

import linkedList.LinkedList;
import linkedList.LinkedList.Node;

public class Sum {

	public static void main(String[] args) {
		/*�������� �ǿ� ������������ʾ�����Ǹ���������
		���У����Ǹ��Ե�λ���ǰ��� ���� �ķ�ʽ�洢�ģ�
		�������ǵ�ÿ���ڵ�ֻ�ܴ洢 һλ ���֡�*/
		
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		
		l1.add(9);
		l1.add(3);
		l1.add(5);
		
		l2.add(3);
		l2.add(7);
		l2.add(4);
		
		addTwoNumbers(l1,l2).print();
	}
	public static LinkedList addTwoNumbers(LinkedList l1,LinkedList l2){
		LinkedList l = new LinkedList();
		int tmp = 0,carry = 0;
		int h1Out = 0,h2Out = 0;
		Node h1 = l1.getHead();
		Node h2 = l2.getHead();
		
		while(h1!=null){
			if (h2!=null){
				if (carry == 1){
					tmp++;
				}
				
				tmp += (h1.data+h2.data);
				if (tmp >= 10){
					carry = 1;
					tmp = tmp%10;
				}else{
					carry = 0;
				}
				l.add(tmp);
				tmp = 0;
				
				h1 = h1.getNext();
				h2 = h2.getNext();
			}else{
				h2Out = 1;
				break;
			}
		}
		if (h2Out == 1){
			while(h1!=null){
				if (carry == 1){
					tmp++;
					carry = 0;
				}
				tmp += h1.data;
				if (tmp>=10){
					tmp = tmp%10;
					carry = 1;
				}
				l.add(tmp);
				tmp = 0;
			}
			if (carry == 1)
				l.add(carry);
		}else if(h1Out == 0&&h2Out == 0){
			while(h2!=null){
				if (carry == 1){
					tmp++;
					carry = 0;
				}
				tmp += h2.data;
				if (tmp>=10){
					tmp = tmp%10;
					carry = 1;
				}
				l.add(tmp);
				tmp = 0;
			}
			if (carry == 1)
				l.add(carry);
		}
		return l;
	}
	

}
