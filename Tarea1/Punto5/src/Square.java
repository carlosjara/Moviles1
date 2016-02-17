/**
 * @author Carlos Jaramillo
 * @author Edgar Amezquita
 *
*/
public class Square extends GeometricFigure {
	private double edge;
	
	Square(double edge, String name, String description){
		this.edge = edge;
		this.setName(name);
		this.setDescription(description);
	}
	public void setEdge(double edge){
		this.edge = edge;
	}	
	public double getEdge(){
		return this.edge;
	}
		
	@Override
	public double caclulateArea() {
		return (Math.pow(this.edge,2));
	}
	@Override
	public double calculatePerimeter() {
		return (this.edge*4);
	}


}
