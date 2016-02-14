package Pruebas;

import java.util.ArrayList;

import org.junit.Test;

public class arraylistTest {
	ArrayList<String> arrayList = new ArrayList<String>();
	
	@Test
	public void test100() {
		arrayList al = new arrayList(arrayList);
		al.addElements(100);
		al.getElements(100);
		al.removeElements(100);
	}
	
	@Test
	public void test1000() {
		arrayList al = new arrayList(arrayList);
		al.addElements(1000);
		al.getElements(1000);
		al.removeElements(1000);
	}
	
	@Test
	public void test10000() {
		arrayList al = new arrayList(arrayList);
		al.addElements(10000);
		al.getElements(10000);
		al.removeElements(10000);
	}

}
