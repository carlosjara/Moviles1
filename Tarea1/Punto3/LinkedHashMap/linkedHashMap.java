package Pruebas;

import java.util.LinkedHashMap;

/**
 * @author Carlos Jaramillo
 * @author Edgar Amezquita
 *
*/

public class linkedHashMap {
	public LinkedHashMap<Integer,String> lhMap = new LinkedHashMap<Integer,String>();
	
	//CONSTRUCT
	public linkedHashMap(LinkedHashMap<Integer, String> hMap) {
		this.lhMap = hMap;
	}

	//PUT
	public void putElements(int num){
		for (int i = 0; i < num; i++) {
			lhMap.put(i,"Value");
			System.out.println("Put");
		}
	}
	
	//GET
	public void getElements(int num){
		for (int i = 0; i < num; i++) {
			lhMap.get(i);
			System.out.println("Get");
		}
	}
	
	//REMOVE
	public void removeElements(int num){
		for (int i = 0; i < num; i++) {
			lhMap.remove(i);
			System.out.println("Remove");
		}
	}

}
