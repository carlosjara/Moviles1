package punto2.tarea;

/**
 * @author Carlos Jaramillo
 *
*/

class TestAbstraction2{
    public static void main(String args[]){
        Mammal m1 = new Mammal();
        Birds b1 = new Birds();
        
        b1.eat();
        m1.travel();
        m1.eat();
        b1.travel();
        System.out.println(m1.numOfLegs());  
    }
}

