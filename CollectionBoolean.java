package collections;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CollectionBoolean {
	public static void main(String[] args) {
		Collection<Student> collection = new ConcurrentLinkedQueue<Student>();
		
		boolean empty = collection.isEmpty();
		System.out.println(empty);

		Student collection1 = new Student(1, "fffgfgf", "5th", 6545545);
		Student collection2 = new Student(2, "fffgfgf", "8th", 9545545);
		Student collection3 = new Student(3, "fffgfgf", "6th", 75455455);
		Student collection4 = new Student(4, "fffgfgf", "4th", 8545545);
		collection.add(collection1);
		collection.add(collection2);
		collection.add(collection3);
		collection.add(collection4);
		

		empty = collection.isEmpty();
		System.out.println("list1 is empty: " + empty);

		// if (collection.isEmpty()) {

		// System.out.println("isEmpty() method returns " + collection.isEmpty());

		// } else {

		// System.out.print("Elements are : " + collection);

	}
	

}
