/* Name: Anthony Kravchishin */
import java.util.*;

public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    List<String> list = new ArrayList<>();
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    list.add("First");
    list.add("Second");
    list.add("Third");
    // Get the value of the array at index 2
    System.out.println(list.get(2));
    // Get the length of the array
    System.out.println(list.size());
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    // Iterate over the array using a for-each loop and print out each item
    for (String item : list) {
        System.out.println(item);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
