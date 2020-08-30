package joint;

import linkedList.LinkedList;

public class Joint {

	public static void main(String[] args) {
		/*将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
		输入：1->2->4, 1->3->4
		输出：1->1->2->3->4->4*/
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		
		l1.add(1);
		l1.add(2);
		l1.add(4);
		
		l2.add(1);
		l2.add(3);
		l2.add(4);
		
		LinkedList p = joint(l1,l2);
		p.print();

	}
	
	public static LinkedList joint(LinkedList l1,LinkedList l2){
		LinkedList p = new LinkedList();
		int flag = 0;
		while(l1.getHead()!=null || l2.getHead()!=null){
			if (l1.getHead()==null && l2.getHead()!=null){
				while(l2.getHead()!=null){
					p.add(l2.getHead().data);
					l2.setHead(l2.getHead().getNext());
				}
				flag = 1;
			}else if (l1.getHead()!=null && l2.getHead()==null){
				while(l1.getHead()!=null){
					p.add(l1.getHead().data);
					l1.setHead(l1.getHead().getNext());
				}
				flag = 1;
			}
			
			if (flag == 1){
				break;
			}
			
			if (l1.getHead().data<l2.getHead().data){
				p.add(l1.getHead().data);
				l1.setHead(l1.getHead().getNext());
			}else{
				p.add(l2.getHead().data);
				l2.setHead(l2.getHead().getNext());
			}
			
			
		}
		return p;
		
	}
	
	public static int min(int a,int b){
		return (a<b)?a:b;
	}

}
