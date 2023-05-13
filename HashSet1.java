package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet1 {
	public static void main(String[] args) {
		Set<String>hashSet= new HashSet<String>();
		
		hashSet.add("pooja");
		hashSet.add("rukmini");
		hashSet.add("kishor");
		hashSet.add("mahesh");
		
		
		for(String obj:hashSet) {
			System.out.println(obj);
		}
		System.out.println("*************************************");
		
		Set<String>li=new LinkedHashSet<String>();
		li.add("pooja");
		li.add("rukmiji");
		li.add("kishor");
		li.add("mahesh");
		
		for(String obj:li) {
			System.out.println(obj);
		}
		System.out.println("**********************");
		
		
		TreeSet<String>ts=new TreeSet<String>();
		ts.add("pooja");
		ts.add("rukmini");
		ts.add("mahesh");
		ts.add("kishor");
		ts.forEach(tree->System.out.println(tree));
		
		//for(String tree:ts) {
		// System.out.println(tree);
		//}
		
	}
}

