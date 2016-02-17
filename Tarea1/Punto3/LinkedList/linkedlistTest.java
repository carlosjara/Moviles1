package Pruebas;

import java.util.LinkedList;

import org.junit.Test;

/**
 * @author Carlos Jaramillo
 *
*/

public class linkedlistTest {

	LinkedList<String> list = new LinkedList<String>();
	
	@Test
	public void test100() {
		linkedList ll = new linkedList(list);
		ll.addElements(100);
		ll.getElements(100);
		ll.removeElements(100);
	}
	
	@Test
	public void test1000() {
		linkedList ll = new linkedList(list);
		ll.addElements(1000);
		ll.getElements(1000);
		ll.removeElements(1000);
	}
	
	@Test
	public void test10000() {
		linkedList ll = new linkedList(list);
		ll.addElements(10000);
		ll.getElements(10000);
		ll.removeElements(10000);
	}
}
