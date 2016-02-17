/**
 * @author Carlos Jaramillo
 * @author Edgar Amezquita
 *
*/
public class Main {

	public static void main(String args[]) {
		Circle cir = new Circle(3.14,5.12,"Cir","Esto es un circulo de prueba");
		Rectangular rect = new Rectangular(5,35,"Rect","Esto es un rectangulo de prueba");
		Square squ = new Square(64,"Squ","Esto es un cuadrado de prueba");
		
		System.out.println(cir.getName()+" Area is :"+cir.caclulateArea());
		System.out.println(cir.getName()+" Area overloaded with 3.5 as pi is :"+cir.calculateArea(3.5));
		System.out.println(cir.getName()+" Perimeter is :"+cir.calculatePerimeter());
		
		
		System.out.println(rect.getName()+" Area is :"+rect.caclulateArea());
		System.out.println(rect.getName()+" Perimeter is :"+rect.calculatePerimeter());
		
		System.out.println(squ.getName()+" Area is :"+squ.caclulateArea());
		System.out.println(squ.getName()+" Perimeter is :"+squ.calculatePerimeter());

	}

}
