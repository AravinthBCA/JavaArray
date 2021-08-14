import java.util.*;
import java.io.*;

public class BubbleSort {
	public static int[] sort(int arr[]) {
		int min=0;
		for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
