import java.util.*;

/*
 * Set: Interface
 * HashSet: Implementation
 * TreeSet: Implementation [Sorted]
 * 
 *  Properties: 
 *       1. Unordered Collection
 *       2. Cannot store duplicate elements
 *       3. It has more implementation such as Hashset, TreeHashSet and TreeSet
 *       
 *       TreeSet contains elements is Sorted Order.
 */

public class HashSet_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>hashSet=(Set<Integer>) new HashSet();
		hashSet.add(23);
		hashSet.add(4);
		hashSet.add(4);
		hashSet.add(4);
		hashSet.add(10);
		for(int element: hashSet){
			System.out.println(element+" ");
		}
		//hashSet.isEmpty(); //returns true, if Set is empty
//		hashSet.Contians(20); //returns true, if th element is found
//		hashSet.Remove(23); //returns true, if the element was deleted
//		hashSet.clear();     //Deletes all element
		
		System.out.println();
		Set<Integer> treeSet=(Set<Integer>) new TreeSet();
		treeSet.add(23);
		treeSet.add(4);
		treeSet.add(4);
		treeSet.add(4);
		treeSet.add(10);
		for(int element: treeSet){
			System.out.println(element+" ");
		}
	}

}
