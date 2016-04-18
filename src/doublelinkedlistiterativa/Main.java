package doublelinkedlistiterativa;

public class Main {

	public static void main(String[] args) {
		
		DoubleLinkedList list = new DoubleLinkedList();
		
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		list.insertLast(4);
		list.insertFirst(0);
		list.insertFirst(-1);
		list.insertLast(5);
		
		list.remove(-1);
		
		System.out.println(list.size());
		
		System.out.println(list.toString());
		                 

	}

}
