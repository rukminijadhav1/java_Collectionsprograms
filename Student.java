package collections;

public class Student {
	private int RollNo;
	private String Name;
	private String Standard;
	private long MobileNumber;

	public Student(int rollNo, String name, String standard, long mobileNumber) {
		super();
		RollNo = rollNo;
		Name = name;
		Standard = standard;
		MobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", Name=" + Name + ", Standard=" + Standard + ", MobileNumber="
				+ MobileNumber + "]";
	}

}
