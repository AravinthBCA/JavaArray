
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class NextGreatestNumber{
  
    public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int len = input.length();
        String result = "";
        for(int v = 0; v < len; v++){
        	if(!result.contains(String.valueOf(input.charAt(v)))){
        		result += String.valueOf(input.charAt(v));
        	}
        }
        System.out.println(result);
    }
}