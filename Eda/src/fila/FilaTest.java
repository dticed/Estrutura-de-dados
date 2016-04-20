package fila;

import org.junit.Assert;
import org.junit.Test;

public class FilaTest {
	
	@Test
	public void testFila() {
		
		//Criação da fila
		Fila f = new Fila(4);
		
		//Verificação se fila está vazia
		Assert.assertTrue(f.isEmpty());
		
		//Adicionando elemento
		f.add(2);
		Assert.assertFalse(f.isEmpty());
		
		//Verificando elemento adicionado
		Assert.assertTrue(f.head() == 2);
		
		//Verificando outro elemento adicionado e head da fila
		f.add(3);
		Assert.assertTrue(f.head() == 2);
		
		//Verificando se fila esta cheia
		f.add(4);
		f.add(5);
		Assert.assertTrue(f.isFull());
		
		//Verificando remoção de elementos da fila
		f.remove();
		Assert.assertTrue(f.head() == 3);
		
		//verificando fila dinamica adicionando elemento apos ter enchido
		f.add(6);
		Assert.assertTrue(f.isFull());
		
		//removendo todos 
		f.remove();
		f.remove();
		f.remove();
		f.remove();
		Assert.assertTrue(f.isEmpty());
		
		//Adicionando valores até a pilha encher e lançar exceção
		f.add(1);
		f.add(2);
		f.add(3);
		f.add(4);
		Assert.assertTrue(f.head() == 1);
		Assert.assertFalse(f.isEmpty());
		Assert.assertTrue(f.isFull());
		
		
	}

}
