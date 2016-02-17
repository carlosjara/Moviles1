package Pruebas;

import java.util.Vector;

import org.junit.Test;

/**
 * @author Carlos Jaramillo
 * @author Edgar Amezquita
 *
*/
public class vectorTest {

	Vector<String> vector = new Vector<String>();
	
	@Test
	public void test100() {
		vector vc = new vector(vector);
		vc.addElements(100);
		vc.getElements(100);
		vc.removeElements(100);
	}
	
	@Test
	public void test1000() {
		vector vc = new vector(vector);
		vc.addElements(1000);
		vc.getElements(1000);
		vc.removeElements(1000);
	}
	
	@Test
	public void test10000() {
		vector vc = new vector(vector);
		vc.addElements(10000);
		vc.getElements(10000);
		vc.removeElements(10000);
	}

}
