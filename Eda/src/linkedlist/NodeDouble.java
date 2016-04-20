package linkedlist;

public class NodeDouble {
	
	private int valor;
	private NodeDouble next;
	private NodeDouble previous;
	
	public NodeDouble(int valor) {
		this.valor = valor;
		this.next = null;
		this.previous = null;
	}
	
	public int getValor() { 
		return this.valor;
	}
	
	public NodeDouble getNext() {
		return this.next;
	}
	
	public NodeDouble getPrevious() {
		return this.previous;
	}
	
	public void setNext(NodeDouble node) {
		this.next = node;
	}
	
	public void setPrevious(NodeDouble node) {
		this.previous = node;
	}
	
	public String toString() {
		return this.valor + "";
	}
	
}
