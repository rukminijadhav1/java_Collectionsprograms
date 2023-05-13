package collections.ObjectToArray;

public class Employee1 {
	private int EmpId;
	private String Name;
	private long MobileNum;
	private double salary;
	public Employee1(int empId, String name, long mobileNum, double salary) {
		super();
		EmpId = empId;
		Name = name;
		MobileNum = mobileNum;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [EmpId=" + EmpId + ", Name=" + Name + ", MobileNum=" + MobileNum + ", salary=" + salary + "]";
	}
	
	
	

}
