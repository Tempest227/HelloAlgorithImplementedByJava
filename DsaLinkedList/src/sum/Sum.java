package sum;

import linkedList.LinkedList;
import linkedList.LinkedList.Node;

public class Sum {

	public static void main(String[] args) {
		/*给出两个 非空 的链表用来表示两个非负的整数。
		其中，它们各自的位数是按照 逆序 的方式存储的，
		并且它们的每个节点只能存储 一位 数字。*/
		
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
