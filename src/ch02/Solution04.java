package ch02;

public class Solution04 {

	public static LinkedList combain(LinkedList l1, LinkedList l2){
		Node h1 = l1.getHead() ;
		Node h2 = l2.getHead() ;
		LinkedList result = new LinkedList() ;
		int divide = 0 ;
		//asume that l1 and l2 has the same length
		while(h1 != null){
			int num = h1.getId() + h2.getId() ;
			result.add(num % 10 + divide);
			divide = num / 10 ;
			h1 = h1.getNext() ;
			h2 = h2.getNext() ;
		}
		//the last node
		if(divide != 0)
			result.add(divide);
		
		return result ;
	}
	
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList() ;
		l1.add(3);l1.add(1);l1.add(5);
		LinkedList l2 = new LinkedList() ;
		l2.add(5);l2.add(9);l2.add(5);
		System.out.println("l1 : " + l1.toString());
		System.out.println("l2 : " + l2.toString());
		System.out.println(combain(l1, l2));

	}

}
