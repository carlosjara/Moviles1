import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * @author Carlos Jaramillo
 * @author Edgar Amezquita
 *
*/

public class ageSort implements Comparator<Student>, IComparisonStrategy {

	public int compare(Student s, Student s2){
		return s.getAge()-s2.getAge();
	};
	
	@Override
	public void sort(List<Student> students) {
		Collections.sort(students, new ageSort());
	}

}
