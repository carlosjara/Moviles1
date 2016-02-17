/**
 * @author Carlos Jaramillo
 * @author Edgar Amezquita
 *
*/
public class Student {
	private String name;
	private String career;
	private int age;
	IComparisonStrategy strategy;
	
	Student(String name, String career, int age){
		this.name = name;
		this.career = career;
		this.age = age;		
	};
	
	public void setName(String name){
		this.name = name;
	};
	public void setCareer(String career){
		this.career = career;
	};
	public void setAge(int age){
		this.age = age;
	};
	
	public String getName(){
		return this.name;
	};
	public String getCareer(){
		return this.career;
	};
	public int getAge(){
		return this.age;
	};
	
	
}
