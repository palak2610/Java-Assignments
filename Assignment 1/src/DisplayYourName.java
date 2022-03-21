//1. Write Text‐Based Application using Object‐Oriented Approach to display your name.
import java.util.*;
class Name {
 public void display(String name) {
 System.out.println(name);
 }
}

public class DisplayYourName {
 public static void main(String[] args) {
 Name myname = new Name(); // creating a new object of Name class
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter your name to Display");
 String name = sc.nextLine();
 myname.display(name); // executing the display() method in the Name class
 }
}