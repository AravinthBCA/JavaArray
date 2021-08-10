//    Get integer array from user
//    Print only unique values and order based on maximum no of count 
//
//			Ex
//			Input	                Count	      Output
//			[1,1,3,3,3,1, 9,3,9]	1 -> 3        [3, 9, 1]
//			                        3 -> 4
//			                        9 -> 2	

//			[1,1,3,3,5,3,9, 5]	    1 -> 2        [3, 1, 5, 9]
//			                        3 -> 3
//			                        5 -> 2
//			                        9 -> 1	


import java.util.*;
import java.io.*;
import java.util.regex.*;

public class NumberOfTime {
	
	void matrix(){
		int n;
		Scanner in=new Scanner(System.in);
		ArrayList <Integer> num = new ArrayList<Integer>();
		System.out.println("Enter the Array Limit: ");
		n=in.nextInt();
		for(int i=0;i<n;i++){
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfTime obj = new NumberOfTime();
//		obj.matrix();
		String str="12th";
		String st1=str.replaceAll("[^A-Za-z]","");
		String st2=str.replaceAll("[^0-9]","");
		System.out.println("String b = "+st1);
		System.out.println("Int c= "+st2);
		String str3="12th";
		String str4[]=str3.split("t");
		System.out.println(str4[0]);
	}

}
