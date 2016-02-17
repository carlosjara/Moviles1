package punto2.tarea;

/**
 * @author Carlos Jaramillo
 * @author Edgar Amezquita
 *
*/

abstract class vehicle{
    vehicle(){
        System.out.println("--Vehicle is created--");
    }
    abstract void run();    
}

class Bike extends vehicle{
    void run(){
        System.out.println("--BIKE-- Running Safely...");
    }
}

class Car extends vehicle{
    void run(){
        System.out.println("--CAR-- Running Safely...");
    }
}

class TestAbstraction1{
    public static void main(String args[]){
        Car car1 = new Car();
        Bike bike1 = new Bike();
        
        car1.run();
        bike1.run();  
    }  
} 

