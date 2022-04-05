package Student;

public class Student {
	int studentID;
	String studentName;
	double mark;

	// constructor
	public Student(int getStudentID, String getStudentName, double getMark) {
		studentID = getStudentID;
		studentName = getStudentName;
		mark = getMark;
	}
	
	// Start Getter
	public int getStudentID() {
		return studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public double getMark() {
		return mark;
	}
	
	// End Getter
	// Start Setter
	public void setMark(double changeMark) {
		mark = changeMark;
	}
	// End Setter
	
	//toString method
	public String toString() {
		return ("Student name: " + studentName + "\nStudent ID: "+ studentID + "\nStudent mark: "+ mark+"\n------------------");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
