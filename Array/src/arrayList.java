import java.util.ArrayList;
import java.util.Collections;


public class arrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");//to add the element in the array
	    cars.get(0);//to display the element in the array
	    cars.remove(1);//to remove the element in the array
	    cars.set(1,"BMW");//to update the element in the array
	    System.out.println(cars);
	    System.out.println(cars.get(0));
	    System.out.println(cars.size());
	    Collections.sort(cars); 
	    for (String i : cars) {
	      System.out.println(i);
	    }
	    cars.clear();//to clear or drop the array
	}

}
