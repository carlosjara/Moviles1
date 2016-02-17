/**
 * @author Carlos Jaramillo
 * @author Edgar Amezquita
 *
*/
public class Circle extends GeometricFigure {

	private double pi;
	private double ratio;
	
	Circle(double pi, double ratio, String name, String description){
		this.pi = pi;
		this.ratio = ratio;
		this.setName(name);
		this.setDescription(description);
	}
	public void setPi(double pi){
		this.pi = pi;
	}
	public void setRatio(double ratio){
		this.ratio = ratio;
	}
	
	public double getPi(){
		return this.pi;
	}
	
	public double getRatio(){
		return this.ratio;
	}
	
	@Override
	public double caclulateArea() {
		return (this.pi*Math.pow(this.ratio, 2));
	}
	
	public double calculateArea(double pi){
		return (pi*Math.pow(this.ratio, 2));
	}

	@Override
	public double calculatePerimeter() {
		return (2*this.pi*this.ratio);
	}


}
