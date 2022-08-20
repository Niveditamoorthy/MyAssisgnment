package Week3.day1.org.college;

public class Student extends Department{

	public void studentName() {
		System.out.println("Nivedita");
	}
	
	public void studentDept() {
		System.out.println("MBA");
	}
	
	public void studentId() {
		System.out.println("143");
	}
	
	public static void main(String[] args) {
	
		Student call = new Student();
		call.collegeName();
		call.collegeCode();
		call.collegeRank();
		call.departmentName();
		call.studentName();
		call.studentId();
		call.studentDept();
		
	}
}
