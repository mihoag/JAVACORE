/*
 The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:
 
+ The ArrayList class has many useful methods. For example, to add elements to the ArrayList, use the add() method
+ To access an element in the ArrayList, use the get() method and refer to the index number:
+ To modify an element, use the set() method and refer to the index number:
+ To remove an element, use the remove() method and refer to the index number:
+ To remove all the elements in the ArrayList, use the clear() method:
+ To find out how many elements an ArrayList have, use the size method:

+Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of type "String". Remember that a String in Java is an object (not a primitive type). To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
+Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically:
*/
import java.util.ArrayList;
import java.util.Collections;
public class arraylist 
{
public static void main(String[] argv)
{
 ArrayList<String> q = new ArrayList<String>();
 q.add("Hoang");
 q.add("Cuong");
 q.add("Hoai");
 q.add("Hieu");
 q.add("Hao");
 q.add("Duy");

 System.out.println(q);
 System.out.println("Size: "  + q.size());
 
 // xoa
 q.remove(0);
 System.out.println(q);
  // sua
 q.set(0, "Hung");
 // Dung for each
 for(String x : q)
 {
    System.out.println(x + " ");
 }
 // sort
ArrayList<Integer> p = new ArrayList<Integer>();
p.add(2);
p.add(1);
p.add(10);
p.add(3);
p.add(7);
p.add(5);
p.add(4);
p.add(11);
p.add(9);

System.out.println("Array before sort");
System.out.println(p);

Collections.sort(p);

System.out.println("Array after sort");
System.out.println(p);

}
}