package Pruebas;

import java.util.LinkedHashMap;

import org.junit.Test;

/**
 * @author Carlos Jaramillo
 * @author Edgar Amezquita
 *
*/

public class linkedHashMapTest {
	LinkedHashMap<Integer,String> lhmap = new LinkedHashMap<Integer,String>();
	
	@Test
	public void test100() {
		hashMap hmp = new hashMap(lhmap);
		hmp.putElements(100);
		hmp.getElements(100);
		hmp.removeElements(100);
	}
	
	@Test
	public void test1000() {
		hashMap hmp = new hashMap(lhmap);
		hmp.putElements(1000);
		hmp.getElements(1000);
		hmp.removeElements(1000);
	}
	
	@Test
	public void test10000() {
		hashMap hmp = new hashMap(lhmap);
		hmp.putElements(10000);
		hmp.getElements(10000);
		hmp.removeElements(10000);
	}

}
