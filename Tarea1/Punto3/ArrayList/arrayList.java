package Pruebas;

import java.util.ArrayList;

/**
 * @author Carlos Jaramillo
 *
*/

public class arrayList {
	
	public ArrayList<String> arrlist = new ArrayList<String>();
	
	public arrayList(ArrayList<String> alist) {
		this.arrlist = alist;
	}

	public void addElements(int num){
		for (int i = 0; i < num; i++) {
			arrlist.add(i,"A");
			System.out.println("Element is added.");
		}
	}

	public void getElements(int num){
		for (int i = 0; i < num; i++) {
			arrlist.get(i);
			System.out.println(("Element: "+arrlist.get(i)));
		}
	}
	
	
	public void removeElements(int num){
		for (int i = 0; i < num; i++) {
			arrlist.remove(0);
			System.out.println("Element was removed.");
		}
	}

}
