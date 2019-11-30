/* 
First Attemt to understand what the heck are HashMaps following this doc

https://beginnersbook.com/2013/12/hashmap-in-java-with-example/

HashMaps are Map based *Collection* class used to store Key/value pairs HashMap<K, V>
- No guarantees of the order (so unordered??)
	- Does not returns K,V pairs in the same order its added
	- Does not sort K, V
- Similar to HashTable?? except its unsynchronised and allows NULL (V and K)
*/



import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class LearnHMap {
	public static void main(String args[]) {
		// declare hashmap
		HashMap <Integer, String> hmap = new HashMap<Integer, String>();

		// Add elements to map
		hmap.put(12, "Steve");
		hmap.put(1, "Dave");
		hmap.put(5, "Susan");
		hmap.put(3, "Johnk");
	
		// display content Using Itterator
		Set set = hmap.entrySet();
		Iterator itrr = set.iterator();
		while(itrr.hasNext()) {
			Map.Entry mentry = (Map.Entry)itrr.next();
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}


		// get val based on key Integer
		System.out.println("\nValue at 2 is: " + hmap.get(2));

		// remove value based on keys
		hmap.remove(3);
		System.out.println("\nRemoved something");
		Set set2 = hmap.entrySet();
		Iterator itrr2 = set2.iterator();
		while(itrr2.hasNext()) {
			Map.Entry mentry2 = (Map.Entry)itrr2.next();
			System.out.print("key is: " + mentry2.getKey() + " & Value is: ");
			System.out.println(mentry2.getValue());
		}
	}
}
