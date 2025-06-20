/**
 * An interface that defines the reusable contract for classes that sort and store integer values in ascending order.
 * 
 * Any class that implements this interface must provide mechanisms to
 * insert and display sorted values.
 * 
 * This interface reflects reusability because it allows for interchangeable sorting implementations using either a {@link LinkedListSorter} or a {@link StackSorter}.
 * 
 * @author Verneva Ziga and ChatGPT
 * @version 1.0.0
 * @since Week 6 of CSC6301
 */
public interface NumberSorter {

    /**
     * Inserts a new integer into the relevant data structure while sorting
     * in ascending order. This method reflects reusability as it can be overridden to apply either the {@link LinkedListSorter} or {@link StackSorter} class versions of sorting.
     * 
     * @param valueToInsert the integer to insert
     */
    void insertAscending(int valueToInsert);

    /**
     * Prints sorted values in ascending order. This method reflects reusability since each implementing class can specify its own way of printing values from either the linked list or stack.
     */
    void printSortedValues(); 
}
