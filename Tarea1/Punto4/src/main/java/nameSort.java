import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * @author Carlos Jaramillo
 * @author Edgar Amezquita
 *
*/

public class nameSort implements IComparisonStrategy, Comparator<Student> {
	public int compare(Student s, Student s2){
		return s.getName().compareTo(s2.getName());
	};
	
	@Override
	public void sort(List<Student> students) {
		Collections.sort(students, new nameSort());
	}

}
