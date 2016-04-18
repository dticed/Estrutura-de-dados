package pilhaiterativa;

public class Pilha {
	
	private int[] pilha;
	private int top;
	
	public Pilha(int tamanho) {
		this.pilha = new int[tamanho];
		this.top = -1;
		
	}
	
	public int getIndexTop() {
		return this.top;
	}
	
	public boolean isEmpty() {
		if(this.top == -1) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(this.top == pilha.length - 1) {
			return true;
		} else {
			return false;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException();
		} 
		return this.pilha[top];
	}
	
	public void push(int n) throws RuntimeException {
		if(isFull()) {
			throw new RuntimeException("Pilha cheia.");
		} else {
			top++;
			pilha[top] = n;
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			throw new RuntimeException("Pilha está vazia e elemento não pode ser removido.");
		}
		top--;
	}
	
}
