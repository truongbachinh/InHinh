package JavaInterface;

public class Student implements Comparable<Student>{
	private String studentID;
	private String studentName;
	private float AVG;
	

	public String getStudentID() {
		return studentID;
	}


	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public float getAVG() {
		return AVG;
	}


	public void setAVG(float aVG) {
		AVG = aVG;
	}
	
	public Student(String studentID, String studentName, float aVG) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		AVG = aVG;
	}
	


	@Override
	public int compareTo(Student comp) {
		// TODO Auto-generated method stub
		//return studentID.compareTo(comp.studentID) + studentName.compareTo(comp.studentName) ; thứ tự tăng dần 
		return comp.studentID.compareTo(studentID);// sắp xếp giảm dần 
	}

}
