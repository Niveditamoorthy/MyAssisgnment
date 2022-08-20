package Week3.day1.polymorphism;

public class DepartmentOverriding extends DepartmentOverridingParent {
	
	public void deptId(int id) {
		super.deptId();
		System.out.println("Department Id: " +id);	
	}
	
	public void deptName(String name) {
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		
		DepartmentOverriding overriding = new DepartmentOverriding();
		overriding.deptId(142);
		overriding.deptName("MBA");
	}

}
