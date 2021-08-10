import java.util.LinkedList;

public class linkedList {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println("Your values: ");
    System.out.println(cars);
    System.out.println("Add the first index: ");
    cars.addFirst("Ara");//add the first index value is "Ara"
    
    System.out.println(cars);
    System.out.println("Add the Last index: ");
    cars.addLast("vinth");//add the last index value is "vinth"
    
    System.out.println(cars);
    System.out.println("Remove the index 1: ");
    cars.remove(1);//remove the first index "BMW"
    
    System.out.println(cars);
    System.out.println("Remove the First index : ");
    cars.removeFirst();//remove the first index "BMW"
    
    System.out.println(cars);
    System.out.println("Remove the Last index: ");
    cars.removeLast();//remove the first index "BMW"
    
    System.out.println(cars);
    System.out.println("Add the element: ");
    cars.add("Ford");//
    System.out.println(cars);
  }
}
