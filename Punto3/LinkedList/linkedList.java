package Pruebas;

import java.util.LinkedList;

/**
 * @author Carlos Jaramillo
 *
*/

public class linkedList {
	public LinkedList<String> linklist = new LinkedList<String>();

	public linkedList(LinkedList<String> linklist) {
		this.linklist = linklist;
	}
	
	public void addElements(int num){
		for (int i = 0; i < num; i++) {
			linklist.add(i,"A");
			System.out.println("Element is added.");
		}
	}
	
	public void getElements(int num){
		for (int i = 0; i < num; i++) {
			linklist.get(i);
			System.out.println(("Element: "+linklist.get(i)));
		}
	}
	
	
	public void removeElements(int num){
		for (int i = 0; i < num; i++) {
			linklist.remove(0);
			System.out.println("Element was removed.");
		}
	}
	
}
