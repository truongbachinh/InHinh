package JavaInterface;

import java.util.Comparator;

public class ComparatorByStudentID  implements Comparator<Student>{

	@Override
	public int compare(Student comp1, Student comp2) {
		// TODO Auto-generated method stub
		
		String ID1 = comp1.getStudentID().substring(comp1.getStudentID().indexOf(" "));
		String ID2 = comp2.getStudentID().substring(comp2.getStudentID().indexOf(" "));
		return ID1.compareTo(ID2);
	}
	
	

}
