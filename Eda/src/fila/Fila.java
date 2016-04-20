package fila;

public class Fila {
	
	private int[] fila;
	private int head;
	private int tail;
	
	public Fila(int tamanho) {
		this.fila = new int[tamanho];
		this.head = -1;
		this.tail = -1;
		
	}
	
	public boolean isEmpty() {
		if(this.head == -1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if((tail + 1)%fila.length == head%fila.length) {
			return true;
		} 
		return false;
	}
	
	public void add(int n) {
		if(isEmpty()) {
			head++;
			tail++;
			fila[head] = n;
		} else if(isFull()) {
			throw new RuntimeException("Pilha cheia.");
		} else {
			tail++;
			fila[tail%fila.length] = n;
			
		}
	}
	
	public void remove() {
		if(!isEmpty()) {
			this.head++;
		}
		if(head%fila.length == tail%fila.length) {
			head = -1;
			tail = -1;
		}
	}
	
	public int head() {
		if(!isEmpty()) {
			return fila[head];
		} 
		throw new RuntimeException("Fila vazia.");
	}

}
