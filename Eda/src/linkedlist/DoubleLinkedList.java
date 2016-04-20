package linkedlist;

public class DoubleLinkedList {
	
	private NodeDouble head;
	private NodeDouble tail;
	private NodeDouble current;
	private int size;
	
	public DoubleLinkedList() {
		this.head = null;
		this.tail = null;
		this.current = null;
		this.size = 0;
	}
	 
	public void insertLast(int valor) {
		NodeDouble newNode = new NodeDouble(valor);
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			newNode.setPrevious(tail);
			tail = newNode;
		}
		size++;
	}
	
	public void insertFirst(int valor) {
		NodeDouble newNode = new NodeDouble(valor);
		if(isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			head.setPrevious(newNode);
			newNode.setNext(head);
			head = newNode;
		}
		size++;
	}
	
	public void remove(int valor) {
		if(head.getValor() == valor) {
			head = head.getNext();
		} else if(tail.getValor() == valor) {
			tail = tail.getPrevious();
		}
		if(search(valor)) {
			current.getPrevious().setNext(current.getNext());
			current.getNext().setPrevious(current.getPrevious());
		}
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean search(int valor) {
		current = head;
		while(current != null) {
			if(current.getValor() == valor) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(this.head == null) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		NodeDouble current = head;
		String string = "Contents: \n <-->";
		
		while(current != null) {
			string = string + current.getValor() + "<--->";
			current = current.getNext();
		}
		return string;
	}
	
}
