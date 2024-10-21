
import java.util.List;  // Import List interface
import java.util.ArrayList;  // Import ArrayList class
import java.util.LinkedList; // Import Linkedlist class

/*

1 - Array

Definition: An array is a fixed-size, indexed collection of elements of the same type.
Size: Fixed at the time of creation. Once an array is created, its size cannot be changed.
Access Time: Arrays allow constant-time access to elements using an index (O(1) for access).
Performance: Arrays are fast for accessing elements but resizing (if needed) involves creating a new array and copying elements.
Memory: Contiguous memory allocation.

 */

class Array{


    public static void main(String[] args){

        int[] numbers = new int[20]; // An array of integers with fixed size of 20

        numbers[0] = 1; // Accessing an element by index
        numbers[1] = 2; // Accessing an element by index
        numbers[18] = 10; // Accessing an element by index

        //In Java, arrays have a fixed size, so you cannot directly insert or remove elements from them as you would with a dynamically resizable structure like an ArrayList.

        System.out.println(numbers[18]);

    }

}



/*

2 - List

Definition: List is an interface in Java that represents an ordered collection of elements. It provides methods for manipulating the size and order of elements.
Types: There are different implementations of List, such as ArrayList, LinkedList, and Vector.
Features: Lists allow dynamic resizing and provide various methods for manipulating elements like adding, removing, and iterating.
Access Time: Access time depends on the specific implementation of the List. For instance, ArrayList provides constant-time access (O(1)), while LinkedList requires linear time (O(n)) for access.
 */


class LIST {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        ////////// A: Adding/ inserting
        fruits.add("Apple");  // Adding an element at the end
        fruits.add("Banana"); // Adding an element at the end
        fruits.add("Orange"); // Adding an element at the end
        fruits.add("Carrot"); // Adding an element at the end
        fruits.add("Olive"); // Adding an element at the end
        fruits.add("Peach"); // Adding an element at the end
        fruits.add("Eggplant"); // Adding an element at the end
        fruits.addLast("plum"); // Adding an element at the end
        fruits.add(7, "Plum");
        fruits.add(8, "Mango");
        fruits.addFirst("grape");// adding an element at the first

        ////////// B: Removing
        fruits.remove(2);  // by index
        fruits.remove("Olive");  // Removing by value
        fruits.removeFirst(); // remove first element
        fruits.removeLast(); // remove last element

        ////////// C: Accessing
        System.out.println(fruits.getFirst()); //
        System.out.println(fruits.get(2)); // Output: Apple
        System.out.println(fruits.getLast()); //

    }
}

/*

3- ArrayList:

Definition: ArrayList is a class that implements the List interface using a dynamically resizable array. It is part of the Java Collections Framework.
Size: Dynamic, meaning it automatically resizes itself when needed (by creating a new larger array and copying the old elements).
Access Time: Constant-time access (O(1)) to elements by index, making it fast for random access.
Insertion/Deletion: Insertions and deletions (except at the end) require shifting elements, leading to O(n) time complexity.
Memory: Less memory overhead compared to LinkedList since it does not store node pointers.
 */


class ARRYLIST {
    public static void main(String[] args) {

        // 1: Add/insertion
        ArrayList<String> list = new ArrayList<>();
        list.add("John");           // Adding at the end
        list.add("Joe");
        list.add("Will");
        list.add("Liam");
        list.add(0, "Emma");  // Adding at index 0 (shift the others)
        list.addFirst("Hossein");
        list.add(3, "David"); // Inserting "David" at index 1 (between Emma and John)
        list.addLast("Joseph");

        // 2 : Removing
        list.remove(1);  // Removing the element at index 1 (removes "David")
        list.remove("John"); // Removing by value (removes "John")
        list.removeFirst();
        list.removeLast();

        // 3: accessing
        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}

/*

4- LinkedList

Definition: LinkedList is a class that implements the List and Deque interfaces using a doubly-linked list structure. Each element (node) contains a reference to both the previous and next elements.
Size: Dynamic, meaning it can grow or shrink as needed.
Access Time: Linear time (O(n)) for accessing elements, since it must traverse the list from the start or the end.
Insertion/Deletion: Fast insertions and deletions (O(1)) at both the head and tail, or anywhere in the list, since it doesn't require shifting elements like an array.
Memory: Each element requires extra memory for storing two pointers (to the next and previous nodes), leading to more memory usage compared to ArrayList.
 */



class LINKEDLIST {
    public static void main(String[] args) {

        ////////// A: Adding

        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");  // Adding at the end
        names.add("John");// Adding at the end
        names.add("Lili");// Adding at the end
        names.add("Steve");// Adding at the end
        names.addLast("Mark");  // Adding at the beginning
        names.add(1, "Charlie"); // Inserting "Charlie" at index 1 (between Alice and John)
        names.addFirst("Bob");      // Adding at the beginning


        ////////// B: Removing

        names.remove(1); // Removing the element at index 1 (removes "Charlie")
        names.remove("lili"); // remove the element by values
        names.removeFirst(); // Removing the first element (removes "Bob")
        names.removeLast(); // Removing the last element (removes "Bob")

        ////////// C: Accessing
        System.out.println(names.get(2));
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
    }
}




