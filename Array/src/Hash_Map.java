import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.io.*;

/*  KEY     : VALUE
 *  "red"   :  "apple"
 *  "yellow": "banana"
 *  "white" : "radish"
 */


/*
 * Map: Interface
 * HashMap: Class that implements interface Map
 * class HashMap implements Map{
 *           ......
 * }
 * 
 * Map Properties: 
 *    1. They contain values based on key
 *    2. They are not ordered
 *    3. "KEY" should be unique
 *    4. "VALUE" can be duplicate
 */



public class Hash_Map implements Map{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> fruits=(Map<String, String>) new HashMap();
		fruits.put("red","apple");
		fruits.put("yellow","banana");
		fruits.put("white","radish");
		fruits.put("green","apple");
		
//		fruits.containsKey("red");   //return true, if key is found
//		fruits.containsValue("apple"); // return true, if values is found
//		fruits.size();       //return the size of the Map
//		fruits.remove("red");  //Deletes the Entry whose key is red
//		frutis.clear();
		
		System.out.println(fruits.get("red"));
		for(Map.Entry pairEntry: fruits.entrySet()){
			System.out.println(pairEntry.getKey()+" "+pairEntry.getValue());
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object compute(Object arg0, BiFunction arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object computeIfAbsent(Object arg0, Function arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object computeIfPresent(Object arg0, BiFunction arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void forEach(BiConsumer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object get(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getOrDefault(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object merge(Object arg0, Object arg1, BiFunction arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putAll(Map arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object putIfAbsent(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object replace(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean replace(Object arg0, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void replaceAll(BiFunction arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

}
