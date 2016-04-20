package pilha;

import org.junit.Assert;
import org.junit.Test;

public class PilhaTest {
	
	@Test
	
	public void testPilha() {
		PilhaIterativa p = new PilhaIterativa(3);
		
		//Verificação de pilha vazia iniciada com topo igual a -1.
		Assert.assertEquals(-1, p.getIndexTop());
		
		//Verificação de pilha vazia.
		Assert.assertTrue(p.isEmpty());
		
		//Verificação de pilha não vazia.
		p.push(2);
		Assert.assertTrue(p.peek() == 2);
		Assert.assertFalse(p.isEmpty());
		
		//verificação de pilha cheia.
		p.push(3);
		p.push(4);
		Assert.assertTrue(p.isFull());
		
		//verificação do pop
		p.pop();
		Assert.assertTrue(p.peek() == 3);
		Assert.assertEquals(1, p.getIndexTop()); //Verificação do apontador
		
		//Verificação do remove quando pilha está vazia
		p.pop();
		p.pop();
		Assert.assertTrue(p.isEmpty());
		
		
		
	}

}
