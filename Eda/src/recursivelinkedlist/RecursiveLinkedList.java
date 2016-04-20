package recursivelinkedlist;

public class RecursiveLinkedList {
	
	private Node head;
	private Node tail;
	private Node aux;
	
	public RecursiveLinkedList() {
		this.head = null;
		this.tail = null;
		
	}
	
	public void add(int value) {
		Node newNode = new Node(value);
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	
	public void remove() {
		if(!isEmpty()) {
			aux = head;
			while(aux)		
		}
	}
	
	public boolean search(Node node) {
		
	}
	
	public int size() {
		aux = head;
		Node temp = aux.getNext();
		if (node == null) {
			return 0;
		} else { 
			return 1 + size();
		}
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}
	
	

}
