
public class Rectangular extends GeometricFigure {
	private double height;
	private double width;
	
	Rectangular(double height, double width, String name, String description){
		this.height = height;
		this.width = width;
		this.setName(name);
		this.setDescription(description);
	}
	public void setHeight(double height){
		this.height = height;
	}
	public void setWidth(double width){
		this.width = width;
	}
	
	public double getHeight(){
		return this.height;
	}
	
	public double getWidth(){
		return this.width;
	}
	
	@Override
	public double caclulateArea() {
		return (this.height*this.width);
	}
	@Override
	public double calculatePerimeter() {
		return (2*(this.height+this.width));
	}


}
