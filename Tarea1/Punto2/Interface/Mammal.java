package punto2.tarea;

/**
 * @author Carlos Jaramillo
 * @author Edgar Amezquita
 *
*/

public class Mammal implements Animal {

	public Mammal() { //Construct
		System.out.println("Mammal is created.");
	}

	@Override
	public void eat() { // Interface method is necessarily implemented by the class.
		System.out.println("Mammal eats.");
	}

	@Override
	public void travel() { //Interface method is necessarily implemented by the class.
        System.out.println("Mammal travels.");
	}
	
    public int numOfLegs(){ // the class could may have others methods.
        return 0;
    }

}
