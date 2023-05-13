package collections.ObjectToArray;

import java.util.ArrayList;
import java.util.Arrays;

import collections.Student;
import collections.IteratorSet.Student1;

public class ObjectToArray {

	public static void main(String[] args) {
		int a=4;

		ArrayList<Employee1> arrayList = new ArrayList<Employee1>();

		Employee1 emp1 = new Employee1(1, "Prashant", 91080800,50040);
		Employee1 emp2 = new Employee1(2, "Pragati", 801726222,30004);
		Employee1 emp3 = new Employee1(3, "Abhinaya", 8082340, 40056);
		Employee1 emp4 = new Employee1(4, "Poonam", 808032440, 90440);

		arrayList.add(emp1);
		arrayList.add(emp3);
		arrayList.add(emp2);
		arrayList.remove(emp1);
		//arrayList.clear();
		
		if(arrayList.contains(emp2)) {  
            System.out.println("Your answer is correct.");  
        }  
        else{  
        System.out.println("Incorrect answer!");  
        }
		
		Object[] arr = arrayList.toArray();
		for(Object data:arr) {
		System.out.println(data);
		}

	}
}
