package collections;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class IteratorList {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		Student student1 = new Student(01, "Rukmini", "5th", 939438484);
		Student student2 = new Student(02, "Mahesh", "10th", 888938484);
		Student student3 = new Student(03, "Priyanka", "12th", 939438484);
		Student student4 = new Student(04, "Minakshi", "10th", 739438484);
		Student student5 = new Student(05, "ananya", "11th", 939568484);
		Student student6 = new Student(06, "Rohini", "10th", 734228484);
		Student student7 = new Student(01, "Rohini", "10th", 734228484);
		list.add(student1);
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		list.add(student6);
		list.add(student7);
		list.remove(student1);
//		Iterator<Student> it = list.iterator();
//	while (it.hasNext()) {
//	System.out.println(it.next());
//}
	
	List<Student>list1=Arrays.asList(student1,student2,student3,student4,student5,student6);
	list.stream().filter(student->student.getStandard().matches()):>findFirst()
	.ifPresent(System.out::println));
	Optional<Student> result = list.stream().findFirst();
	
}
}
