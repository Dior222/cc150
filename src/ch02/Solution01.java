package ch02;

public class Solution01 {

	public static void removeDuplicate(LinkedList list){
		Node head = list.getHead() ;
		Node it = head.getNext() ;
		Node pre = head ;
		while(it != null){
			Node runner = head ;
			while(runner != it){
				if(it.getId() == runner.getId()){
					Node tmp = it.getNext() ;
					pre.setNext(tmp);
					it = tmp ;
					break ;
				}
				runner = runner.getNext() ;
			}
			
			if(runner == it){
				pre = it ;
				it = it.getNext() ;
			}
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);list.add(2);list.add(5);list.add(3);list.add(2);list.add(5);
		removeDuplicate(list);
		System.out.println(list);

	}

}
