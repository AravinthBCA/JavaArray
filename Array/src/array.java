import java.util.*;
import java.io.*;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Integer j;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the array limit: ");
		n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array values: ");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		System.out.println("Your array values: ");
		for(int i=0;i<n;i++){
			System.out.print(" "+arr[i]);
		}
	}

}
