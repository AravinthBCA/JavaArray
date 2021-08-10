import java.util.*;
import java.io.*;

public class stringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Difference between StringBuffer and StringBuilder is Mutable and StringBuffer is Synchronised
		//and Less Efficient and StringBuilder is not Thread safe but More Efficient.
		Scanner in=new Scanner(System.in);
		StringBuilder bul=new StringBuilder("welcome");
		bul.append(" Home");    
		bul.insert(7, " to");            //welcome to Home
		bul.replace(11, 15, "world");       //welcome to world
		bul.delete(7, 16);                   //welcome
		bul.reverse();                 //emoclew
		System.out.println(bul);
	}

}
