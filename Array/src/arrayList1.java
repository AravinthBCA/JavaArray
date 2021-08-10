import java.util.*;
import java.io.*;

public class arrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<>();
		list.add("India");
		list.add("USA");
		list.add("China");
		list.add(0,"Nepal");   //Nepal India USA China
		list.remove(0);
		System.out.print(list.contains("India"));     //it returns true(0) or false(1)
		list.clear();
		for(String s: list){
			System.out.println(s);
		}
	}

}
