package ch02;

public class Solution03 {

	public static void deleteMiddle(LinkedList list, Node mid){
		Node curr = mid ;
		Node next = mid.getNext() ;
		curr.setId(next.getId());
		curr.setNext(next.getNext());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
