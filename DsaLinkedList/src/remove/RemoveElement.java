package remove;

import LinkedList.LinkedList;
import LinkedList.LinkedList.Node;


public class RemoveElement {

	public static void main(String[] args) {
		/*给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
		给定一个链表: 1->2->3->4->5, 和 n = 2.
		当删除了倒数第二个节点后，链表变为 1->2->3->5.*/
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
 * 内部类可以直接访问外部类的成员，包括私有
 * 外部类要访问内部类的成员，必须创建对象
 * 
 * */
