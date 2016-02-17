package punto2.tarea;

/**
 * @author Carlos Jaramillo
 * @author Edgar Amezquita
 *
*/

public class Birds implements Animal{

    public Birds(){ // Construct
            System.out.println("Bird is created.");
    }

    public void eat(){ // Interface method is necessarily implemented by the class.
            System.out.println("Bird eats.");
    }

    public void travel(){ // Interface method is necessarily implemented by the class.
            System.out.println("Bird travels.");
    }

    public int hoursFlight(){ //the clase could may have others methods. 
            return 0;
    }
}
