import java.util.*;
import java.io.*;

public class stringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Difference between StringBuffer and StringBuilder is Mutable and StringBuffer is Synchronised
		//and Less Efficient and StringBuilder is not Thread safe but More Efficient.
		Scanner in=new Scanner(System.in);
		StringBuffer buf=new StringBuffer("welcome");
		buf.append(" Home");          //welcome Home
		buf.insert(7, " to");            //welcome to Home
		buf.replace(11, 15, "world");       //welcome to world
		buf.delete(7, 16);                   //welcome
		buf.reverse();                 //emoclew
		System.out.println(buf);
	}

}
