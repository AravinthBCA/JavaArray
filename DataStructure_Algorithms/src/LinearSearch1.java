//This problem reduce the complexity.

import java.util.*;
import java.io.*;

public class LinearSearch1 {
	
	static int search(int arr[],int find){
		int attempt,left=0,right=arr.length-1,length=arr.length;
		for(left=0;left<=right;left++,right--){
			if(arr[left]==find){
				attempt=left;
				System.out.println("Position: "+(left+1)+", Attempts: "+(attempt+1));
				break;
			}
			if(arr[right]==find){
				attempt=left;
				System.out.println("Position: "+(right+1)+", Attempts: "+(attempt+1));
				break;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,3,5,2,4};
		int find=5;
		search(arr,find);
	}

}
