import java.util.*;
import java.io.*;

public class LinearSearch {
	
	public static int search(int arr[],int find){
		int length=arr.length;
		for(int i=0;i<length;i++){
			if(arr[i]==find){
				return i+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,3,5,2,4};
		int f=5;
		System.out.println("Result: "+search(arr,f));
	}

}
