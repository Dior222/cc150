package ch02;

public class Solution02 {

	public static Node findNthLast(LinkedList list, int n){
		Node head = list.getHead() ;
		int cnt = 1 ;
		Node fast = head ;
		Node slow = head ;
		while(fast != null && fast.getNext() != null && cnt < n){
			fast = fast.getNext() ;
			cnt++ ;
		}
		if(fast == null){
			System.out.println("n is larger than list size !");
			return null ;
		}
		while(fast != null && fast.getNext() != null){
			fast = fast.getNext() ;
			slow = slow.getNext() ;
		}
		return slow ;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);list.add(2);list.add(5);list.add(3);list.add(2);list.add(5);
		System.out.println(findNthLast(list, 2));

	}

}
