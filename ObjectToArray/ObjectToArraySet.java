package collections.ObjectToArray;

import java.util.HashSet;
import java.util.Set;

public class ObjectToArraySet {
	public static void main(String[] args) {

		Set<Employee1> set = new HashSet<Employee1>();

		Employee1 emp1 = new Employee1(1, "Prashant", 91080800, 50040);
		Employee1 emp2 = new Employee1(2, "Pragati", 801726222, 30004);
		Employee1 emp3 = new Employee1(3, "Abhinaya", 8082340, 40056);
		Employee1 emp4 = new Employee1(4, "Poonam", 808032440, 90440);

		set.add(emp1);
		set.add(emp3);
		set.add(emp2);
		set.add(emp4);
		set.add(emp4);

		Object[] s = set.toArray();
		for (Object data : s) {
			System.out.println(data);
		}

	}
}
