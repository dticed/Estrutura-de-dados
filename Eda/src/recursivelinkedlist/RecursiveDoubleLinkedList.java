package recursivelinkedlist;

public class RecursiveDoubleLinkedList {
	
	private Node head;
	private Node tail;
	private int size;
	
	public RecursiveDoubleLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public void insertLast(int valor, Node node) {
		node = new Node(valor);
		if(isEmpty()) {
			head = node;
		} else {
			insertLast(valor, node.getNext());
		}
		tail
	}
	
	public void insertFirst() {
		
	}
	
	public void insertPos() {
		
	}
	
	public boolean search(int valor) {
		return false;
	}
	
	public void remove(int valor) {
		
	}
	
	public int size() {
		current = head;
		if (isEmpty()) {
			return 0;
		} else {
			return 	1 + 
		}
	}
	
	public boolean isEmpty() {
		
	}
	
	public String toString() {
		return "";
	}

}
