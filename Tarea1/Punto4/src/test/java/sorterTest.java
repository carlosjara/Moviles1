import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
/**
 * @author Carlos Jaramillo
 * @author Edgar Amezquita
 *
*/

public class sorterTest {
	
	@Test
	public void test() {
		sorter sorting = new sorter(new nameSort());
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Carlos","Ingenieria",18));
		students.add(new Student("Camilo","Ingenieria",20));
		students.add(new Student("Maria","Comunicacion",21));
		students.add(new Student("Juan","Psicologia",19));
		students.add(new Student("Ramiro","Matematicas",32));
		students.add(new Student("Fabio","Fisica",19));
		
		sorting.sort(students);
		// Tests
		assertEquals("Camilo",students.get(0).getName());
		assertEquals("Carlos",students.get(1).getName());
		assertEquals("Fabio",students.get(2).getName());
		assertEquals("Juan",students.get(3).getName());
		assertEquals("Maria",students.get(4).getName());
		assertEquals("Ramiro",students.get(5).getName());
		
		//Change the sort strategy
		sorting.setStrategy(new careerSort());
		
		sorting.sort(students);
		// Tests
		assertEquals("Psicologia",students.get(0).getCareer());
		assertEquals("Matematicas",students.get(1).getCareer());
		assertEquals("Ingenieria",students.get(2).getCareer());
		assertEquals("Ingenieria",students.get(3).getCareer());
		assertEquals("Fisica",students.get(4).getCareer());
		assertEquals("Comunicacion",students.get(5).getCareer());
		
		sorting.setStrategy(new ageSort());
		
		sorting.sort(students);
		// Tests
		assertEquals(18,students.get(0).getAge());
		assertEquals(19,students.get(1).getAge());
		assertEquals(19,students.get(2).getAge());
		assertEquals(20,students.get(3).getAge());
		assertEquals(21,students.get(4).getAge());
		assertEquals(32,students.get(5).getAge());
		
	}

}
