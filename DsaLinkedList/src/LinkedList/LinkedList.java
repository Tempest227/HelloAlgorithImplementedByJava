package linkedList;

public class LinkedList {
	
	Node head,cur;	
	
	public void add(int data){
		Node node = new Node(data);
		if (head == null){
			head = node;
			cur = node;
		}else{
			cur.next = node;
			cur = node;
		}
	}
	
	public void print(){
		Node pHead = head;
		while(pHead!=null){
			if (pHead.getNext()==null)
				System.out.print(pHead.data);
			else
				System.out.print(pHead.data+"->");
			pHead = pHead.next;
		}
		
	}
	

	public Node getHead(){
		return this.head;
	}
	
	
	public void setHead(Node head) {
		this.head = head;
	}
	


	public Node getCur() {
		return cur;
	}



	public class Node {
		public int data;
		Node next;
		
		public Node(int data){
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
		
	}
}
