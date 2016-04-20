package linkedlist;

public class Main {

	public static void main(String[] args) {
		
		SingleLinkedListIterativa list = new SingleLinkedListIterativa();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		
		list.remove(1);
		
		
		System.out.println(list.toString());

	}

}
