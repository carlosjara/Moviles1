package Pruebas;

import java.util.Vector;

/**
 * @author Carlos Jaramillo
 * @author Edgar Amezquita
 *
*/

public class vector {
	public Vector<String> vctr = new Vector<String>();

	public vector(Vector<String> vctr) {
		this.vctr = vctr;
	}
	
	public void addElements(int num){
		for (int i = 0; i < num; i++) {
			vctr.add(i,"A");
			System.out.println("Element is added.");
		}
	}
	
	public void getElements(int num){
		for (int i = 0; i < num; i++) {
			vctr.get(i);
			System.out.println(("Element: "+vctr.get(i)));
		}
	}
	
	
	public void removeElements(int num){
		for (int i = 0; i < num; i++) {
			vctr.remove(0);
			System.out.println("Element was removed.");
		}
	}
}
