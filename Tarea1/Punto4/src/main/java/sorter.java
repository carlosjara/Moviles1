import java.util.List;
/**
 * @author Carlos Jaramillo
 * @author Edgar Amezquita
 *
*/
public class sorter {
	private IComparisonStrategy stratToApply;
	
	sorter(IComparisonStrategy stratToUse){
		this.stratToApply = stratToUse;
	};
	
	public void setStrategy(IComparisonStrategy newStrategy){
		this.stratToApply = newStrategy;
	};
	
	public IComparisonStrategy getStrategy(){
		return this.stratToApply;
	}
	
	public void sort(List<Student> students){
		this.stratToApply.sort(students);
	};
	
}
