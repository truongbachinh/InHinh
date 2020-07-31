package JavaInterface;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparableInterface {
    public static void main(String[] args)
    {
    	Student st1 = new Student("GCH17527 ","Trương Bá Chính ", 3.5f);
    	Student st2 = new Student("GCH17524 ","Trần Thị Mỹ Linh ", 9.5f);
    	Student st3 = new Student("GCH17523 ","Trần Linh ", 8.5f);
    	Student st4 = new Student("GCH17529 ","Bá Chính ", 7.5f);
    	
    	ArrayList<Student> listST = new ArrayList<>();
    	listST.add(st1);
    	listST.add(st2);
    	listST.add(st3);
    	listST.add(st4);
    	System.out.println("Trước khi sắp xếp");
    	for(Student element : listST)
    	{
    		System.out.print(", StudentID " + element.getStudentID());
    		System.out.print(", StudentName " + element.getStudentName());
    		System.out.println(", Mark " + element.getAVG());
    	}
    	
    	System.out.println("Sau khi sắp xếp");
    	Collections.sort(listST);
    	for(Student element : listST)
    	{
    		System.out.print(", StudentID " + element.getStudentID());
    		System.out.print(", StudentName " + element.getStudentName());
    		System.out.println(", Mark " + element.getAVG());
    	}
    	
    	
    	Collections.sort(listST, new ComparatorByName());
    	for(Student element : listST)
    	{
    		System.out.print(", StudentID " + element.getStudentID());
    		System.out.print(", StudentName " + element.getStudentName());
    		System.out.println(", Mark " + element.getAVG());
    	}
    	
    	Collections.sort(listST, new ComparatorByStudentID());
    	for(Student element : listST)
    	{
    		System.out.print(", StudentID " + element.getStudentID());
    		System.out.print(", StudentName " + element.getStudentName());
    		System.out.println(", Mark " + element.getAVG());
    	}
    	
    	
    	
	}
}
