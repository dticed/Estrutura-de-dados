package recursivelinkedlist;

import org.junit.Assert;
import org.junit.Test;

public class TestRecursiveLinkedList {
	
	@Test
	public void testRecursiveLinkedList() {
		
		RecursiveLinkedList list = new RecursiveLinkedList();
		
		//testando lista vazia
		Assert.assertTrue(list.isEmpty());
		
		//adicionando elemento e testando lista não vazia
		list.add(1);
		Assert.assertFalse(list.isEmpty());
		
		// testando tamanho da linkedList
		Assert.assertEquals(1, list.size());
		
	}

}
