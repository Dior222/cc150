package ch02;

/**
 * Class for node
 * @author darwin
 *
 */
public class Node {

	private int id ;
	
	private Node next = null ;
	
	public Node(int id){
		this.id = id ;
	}
	
	public void addToTail(int id){
		Node tail = new Node(id) ;
		Node curr = this ;
		while(curr.next != null){
			curr = curr.next ;
		}
		curr.next = tail ;
	}

	@Override
	public String toString() {
		return "Node [id=" + id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
