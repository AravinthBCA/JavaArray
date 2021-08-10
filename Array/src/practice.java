import java.util.*;

class practice{
	public static void main(String args[]){
		for(int i=0;i<5;i++){
			System.out.println("outer loop");
			for(int j=0;j<3;j++){
				System.out.println("inner loop");
			}
		}
	}
}