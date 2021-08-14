import java.util.*;
import java.io.*;

public class SelectionSort {
	
	public static int[] sort(int arr[]) {
		int min=0;
		for(int i=0;i<arr.length;i++) {
			min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		return arr;	
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Array size: ");
		int n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		arr=sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
