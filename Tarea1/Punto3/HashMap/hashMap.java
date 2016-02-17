package Pruebas;

import java.util.HashMap;

/**
 * @author Carlos Jaramillo
 * @author Edgar Amezquita
 *
*/

public class hashMap {
	public HashMap<Integer,String> hMap = new HashMap<Integer,String>();
	
	//CONSTRUCT
	public hashMap(HashMap<Integer, String> hMap) {
		this.hMap = hMap;
	}

	//PUT
	public void putElements(int num){
		for (int i = 0; i < num; i++) {
			hMap.put(i,"Value");
			System.out.println("Put");
		}
	}
	
	//GET
	public void getElements(int num){
		for (int i = 0; i < num; i++) {
			hMap.get(i);
			System.out.println("Get");
		}
	}
	
	//REMOVE
	public void removeElements(int num){
		for (int i = 0; i < num; i++) {
			hMap.remove(i);
			System.out.println("Remove");
		}
	}
	
}
