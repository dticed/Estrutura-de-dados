package linkedlist;

public class NodeSingle {
	
	private int valor;
	private NodeSingle next;
	
	public NodeSingle(int valor) {
		this.valor = valor;
		this.next = null;
		
	}
	
	public int getValor(){
		return this.valor;
	}
	
	public NodeSingle getNext() {
		return this.next;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void setNext(NodeSingle next) {
		this.next = next;
	}
	
	public String toString() {
		return valor + "";
	}

}
