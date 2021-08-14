import java.util.*;
import java.io.*;

public class SelectionSortString {
	
	public static String[] sort(String arr[]){
		String minstr="";
		int minindex;
		for(int i=0;i<arr.length;i++) {
			minstr=arr[i];
			minindex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j].compareTo(minstr)<0) {
					minstr=arr[j];
					minindex=j;
				}
			}
			if(minindex!=i) {
				String temp=minstr;
				arr[minindex]=arr[i];
				arr[i]=temp;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Array limit: ");
		int n=in.nextInt();
		String arr[]=new String[n];
		System.out.println("Enter the Array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=in.next();
			in.nextLine();
		}
		arr=sort(arr);
		System.out.println("After sorting: ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
