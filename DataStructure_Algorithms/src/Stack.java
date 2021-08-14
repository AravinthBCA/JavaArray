import java.util.*;
import java.io.*;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[100],n,top=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		n=in.nextInt();
		System.out.println("Enter the stack values: ");
		for(int i=0;true;i++){
			arr[top]=in.nextInt();
			if(arr[top]==-1){
				System.out.println("loop is breaked");
			}
			top++;
		}
	}

}
