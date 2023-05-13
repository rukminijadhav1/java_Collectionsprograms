package collections.IteratorSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import collections.Student;

public class IteratorSet {
	public static void main(String[] args) {

		Set<Student1> set = new HashSet<Student1>();
		Student1 student1 = new Student1(01, "Rukmini", "5th", 939438484);
		Student1 student2 = new Student1(02, "Mahesh", "10th", 888938484);
		Student1 student3 = new Student1(03, "Priyanka", "12th", 939438484);
		Student1 student4 = new Student1(04, "Minakshi", "10th", 739438484);
		Student1 student5 = new Student1(05, "ananya", "11th", 939568484);
		
		set.add(student1);
		set.add(student1);
		set.add(student2);
		set.add(student3);
		set.add(student4);
		set.add(student5);
		
		

		Iterator<Student1> it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
}
}

	

