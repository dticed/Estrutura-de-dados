package recursivelinkedlist;

public class Node {
	
	private int valor;
	private Node previous;
	private Node next;
	
	public Node(int valor) {
		this.valor = valor;
		this.previous = null;
		this.next = null;
	}
	
	public int getValor() {
		return this.valor;
	}
	
	public Node getPrevious() {
		return this.previous;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setNext(Node node) {
		this.next = node;
	}
	
	public void setPrevious(Node node) { 
		this.previous = node;
	}
	
	public String toString() {
		return this.getValor() + "";
	}

}
