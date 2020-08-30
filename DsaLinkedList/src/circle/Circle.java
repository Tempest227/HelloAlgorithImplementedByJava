package circle;

import linkedList.LinkedList;
import linkedList.LinkedList.Node;

public class Circle {

	public static void main(String[] args) {
		//����һ�������ж��������Ƿ��л���
		
		
		LinkedList l = new LinkedList();
		
		l.add(3);
		l.add(2);
		l.add(0);
		l.add(-4);
		l.getCur().setNext(l.getHead());
		
		System.out.println(hasCircle(l));
		
	}
	
	public static boolean hasCircle(LinkedList l){
		if (l.getHead()==null){
			return false;
		}
		Node head = l.getHead();
		Node fast = l.getHead().getNext();
		while(fast!=null&&fast.getNext()!=null&&head!=null){
			if (fast==head){
				return true;
			}
			fast = fast.getNext().getNext();
			head = head.getNext();
		}
		return false;
	}

}
