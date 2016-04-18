package doublelinkedlistiterativa;

public class Node {
	
	private int valor;
	private Node next;
	private Node previous;
	
	public Node(int valor) {
		this.valor = valor;
		this.next = null;
		this.previous = null;
	}
	
	public int getValor() { 
		return this.valor;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public Node getPrevious() {
		return this.previous;
	}
	
	public void setNext(Node node) {
		this.next = node;
	}
	
	public void setPrevious(Node node) {
		this.previous = node;
	}
	
	public String toString() {
		return this.valor + "";
	}
	
}
