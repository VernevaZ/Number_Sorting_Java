import java.util.LinkedList; // Import Java's built-in LinkedList class for code reusability 

/**
 * Simple class that implements the {@link NumberSorter} interface using Java's built-in {@link LinkedList} 
 * to store and maintain integers in ascending order.
 * 
 * The class manages a linked list full of integers. It applies 
 * Java's built-in {@link LinkedList} class to build, manage, and sort the 
 * linked list. 
 * 
 * Version History: 
 * 1.0.0 - Original code written with sole sorting functionality in linked  
 * list class.
 * 1.1.0 - Refactored to implement {@link NumberSorter} for better modularity. Refactored class and function names to reflect new updates after implementing the {@link NumberSorter} interface.
 * 
 * @author Verneva Ziga and ChatGPT
 * @since Week 6 of CSC6301
 * @version 1.1.0
 */
public class LinkedListSorter implements NumberSorter {

    /** 
     * Implements reusability by using Java's built-in {@link LinkedList} class to declare a private variable and increase encapsulation.
     */
    private LinkedList<Integer> sortedValues;

    /**
     * Constructs an empty {@code LinkedListSorter} object.
     * Initializes the internal {@code LinkedList}.
     * Implements reusability by relying on Java's built-in {@link LinkedList} class to build the list.
     */
    public LinkedListSorter() {
        sortedValues = new LinkedList<>();
    }

    /**
     * This method inserts integers into the list in ascending order every time new data is added.
     * 
     * @param valueToInsert The integer to insert into the list.
     */
    @Override
    public void insertAscending(int valueToInsert) {
        int insertIndex = 0;

        // While loop implements reusability with Java's get() method to find the new data's correct index.
        while (insertIndex < sortedValues.size() && valueToInsert > sortedValues.get(insertIndex)) {
            insertIndex++;
        }

        // Implements reusability by using Java's built-in add() method to insert at a specific index.
        sortedValues.add(insertIndex, valueToInsert);
    }

    /**
     * This method prints the contents of the list.
     * The method implements reusability because it can be reused whenever we want to display the current state of the list.
     */
    @Override
    public void printSortedValues() {
        // Start a for-each loop to iterate over each integer 'currentValue' in the 'sortedValues'
        for (int currentValue : sortedValues) {
            // Print the current integer followed by a space (without moving to a new line)
            System.out.print(currentValue + " ");
        }
        System.out.println(); // Move to a new line after printing the list
    }
}

