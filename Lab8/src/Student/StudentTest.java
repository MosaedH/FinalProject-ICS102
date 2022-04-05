package Student;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student (202007161, "Mosaed" ,73.5);
		System.out.println(s1);
		System.out.println("final grade: "+s1.mark + "\n-------------");
		s1.setMark(100.0);
		System.out.println(s1);
	}
}
