package remove;

import LinkedList.LinkedList;
import LinkedList.LinkedList.Node;


public class RemoveElement {

	public static void main(String[] args) {
		/*����һ������ɾ������ĵ����� n ���ڵ㣬���ҷ��������ͷ��㡣
		����һ������: 1->2->3->4->5, �� n = 2.
		��ɾ���˵����ڶ����ڵ�������Ϊ 1->2->3->5.*/
		LinkedList l = new LinkedList();
		
		for (int i=1;i<=5;i++){			
			l.add(i);
		}
		remove(l,2);

	}
	
	public static Node remove(LinkedList l,int n){		
		Node head = l.getHead();
		Node cur = l.getHead();
		Node pre = l.getHead();
		int cnt = 0;
		while(head!=null){			
			if (cnt>=n){
				pre = cur;
				cur = cur.getNext();			    
			}
			head = head.getNext();
			cnt++;
		}
		pre.setNext(cur.getNext());
		l.print();
		return l.getHead();
	}

}
/*
 * �ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽��
 * �ⲿ��Ҫ�����ڲ���ĳ�Ա�����봴������
 * 
 * */
