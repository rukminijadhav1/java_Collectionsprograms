package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapPRogram {
	public static void main(String[] args) {
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(1, "pooja");
		hash.put(2, "rukmini");
		hash.put(3, "kishor");
		hash.put(4, "mahesh");
		System.out.println(hash);

		Set<Integer> keys = hash.keySet();
		for (Integer key : keys) {
			System.out.println(key + " " + hash.get(key));
		}
		System.out.println("******************************************************");

		Set set = hash.entrySet();
		Iterator iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry mapentry = (Map.Entry) iterator.next();
			System.out.println(mapentry.getKey() + "  " + mapentry.getValue());
		}
		LinkedHashMap<Integer, String> hash1 = new LinkedHashMap<Integer, String>();
		hash1.put(1, "pooja");
		hash1.put(2, "rukmini");
		hash1.put(3, "kishor");
		hash1.put(4, "mahesh");
		System.out.println(hash1);

		Set<Integer> keys1 = hash1.keySet();
		for (Integer key : keys1) {
			System.out.println(hash1.get(key));

		}

		Set set1 = hash1.entrySet();
		Iterator iterator1 = set1.iterator();

		while (iterator1.hasNext()) {
			Map.Entry mapentry = (Map.Entry) iterator1.next();
			System.out.println(mapentry.getKey() + " " + mapentry.getValue());

		}

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(3, "Yahoo");
		tm.put(4, "Amazon");
		tm.put(7, "Twiter");
		tm.put(1, "Google");
		tm.put(5, "Reddit");
		tm.put(6, "LinkedIn");
		tm.put(2, "Facebook");
		System.out.println("Elements sorted " + "according to Natural ordering:\n");
		System.out.println(tm);

		Set<Integer> keys2 = tm.keySet();
		for (Integer key : keys2) {
			System.out.println(key + " " + tm.get(key));

		}

	}
}