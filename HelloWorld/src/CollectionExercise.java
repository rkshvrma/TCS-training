import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//good for just retrievals
		List<String>studentList1 = new ArrayList<String>();	
		
		//good for frequent insertions/deletions
		List<String>studentList2 = new LinkedList<String>();
		
		//insertion order not maintained, no print order either
		Set<String>studentSet1 = new HashSet<String>();
		
		//insertion order not maintained, but objects are sorted for output
		Set<String>studentSet2 = new TreeSet<String>();
		
		
		
	}

}
