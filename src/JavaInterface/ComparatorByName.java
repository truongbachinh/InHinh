package JavaInterface;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Student> {

	@Override
	public int compare(Student comp1, Student comp2) {
		// TODO Auto-generated method stub
		String tachName1 = comp1.getStudentName().substring(comp1.getStudentName().lastIndexOf(""));
		String tachName2 = comp2.getStudentName().substring(comp2.getStudentName().lastIndexOf(""));
		return tachName2.compareTo(tachName1);
			
		
	}
	

}
