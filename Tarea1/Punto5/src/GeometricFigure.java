
public abstract class GeometricFigure {
	private String name;
	private String description;
	
	public void setName(String name){
		this.name = name;
	}
	public void setDescription(String description){
		this.description = description;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public abstract double caclulateArea();
	public abstract double calculatePerimeter();
}
