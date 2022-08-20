package Week3.day1.polymorphism;

public class StudentsInfo {
	
	public void student(int id) {
		System.out.println("stuId: " + id);	
	}
		
	public void student(String Name, int id) {
		System.out.println("stuName: " + Name + "id: " + id);	
	}

	public void student(String email, long phNo) {
		System.out.println("stuemail: " + email + "phNo: " + phNo);	
}
	public static void main(String[] args) {
		StudentsInfo overload=new StudentsInfo();
		
		overload.student(133);
		overload.student("Nivedita" , 133);
		overload.student("nvdt.04@gmail.com" , 9673612486l);
	}
}
		
	
