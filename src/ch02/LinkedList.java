package ch02;

public class LinkedList {

	private Node head ;
	
	public LinkedList(){
		this(null) ;
	}
	
	public LinkedList(Node head){
		this.head = head ;
	}
	
	public void add(int id){
		Node tail = new Node(id) ;
		if(head == null){
			head = tail ;
		}
		else{
			Node h = head ;
			while(h.getNext() != null){
				h = h.getNext() ;
			}
			h.setNext(tail);
		}
	}
	
	public String toString(){
		StringBuilder sbuilder = new StringBuilder() ;
		sbuilder.append("LinkedList : ") ;
		if(head == null){
			sbuilder.append("null") ;
			return sbuilder.toString() ;
		}
		else{
			Node h = head ;
			while(h.getNext() != null){
				sbuilder.append(h).append("-->") ;
				h = h.getNext() ;
			}
			sbuilder.append(h) ;
		}
		
		return sbuilder.toString() ;
	}
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);list.add(2);list.add(5);list.add(3);list.add(2);list.add(5);
		System.out.println(list);
	}
}
