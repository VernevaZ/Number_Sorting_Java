import java.util.Stack; // Import Java's built-in Stack class for code reusability 

/**
 * 
 * Simple class that implements the {@link NumberSorter} interface using Java's built-in {@link java.util.Stack} to store and maintain integers in ascending order.
 * 
 * The class manages a stack of integers. It reflects reusability since it implements the {@link NumberSorter} interface. It also uses 
 * Java's built-in stack class to build, manage, and sort the 
 * stack. 
 * 
 * @author Verneva Ziga and ChatGPT
 * @since Week 5 of CSC6301
 * @version 1.0.0
 */
public class StackSorter implements NumberSorter {

  /** 
     * Implements reusability by using Java's built-in Stack class to declare a private stack.
     */

    private Stack<Integer> stack;

    /**
     * Constructs an empty {@code StackSorter} object with an empty internal
     * stack.
     * Implements reusability by relying on Java's built-in Stack class to build a stack. 
     */

    public StackSorter() {
        stack = new Stack<>();
    }

    /**
     * Inserts a new integer into the stack while maintaining ascending order.
     * 
     * Reflects reusablity by implmenting the {@code NumberSorter} interface and more specifically the {@code insertAscending} method to insert values in their correct position.
     * 
     * @param valueToInsert The integer to insert into the stack.
     */
    @Override
    public void insertAscending(int valueToInsert){
        Stack<Integer> tempStack = new Stack<>();

        // While loop implements reusability by applying several built-in methods such as isEmpty() and peek() to insert integers ascending order.
        while (!stack.isEmpty() && stack.peek() < valueToInsert){
            tempStack.push(stack.pop());
        } 
        
        // Implements reusability by using Java's built-in push() method to insert at a specific index.
        stack.push(valueToInsert);

        // Loop restores elements from temporary stack back into original stack maintaining ascending order.
        while(!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }

    }

    /**
     * Prints all stored integers in ascending order.
     * 
     * This method reflects reusability by adhering to the {@code NumberSorter} interface contract to print values. 
     *      
     */
    @Override
    public void printSortedValues(){
        Stack<Integer> reversedStackCopy = new Stack<>();
        reversedStackCopy.addAll(stack);

        for (int stackIndex = reversedStackCopy.size()-1; stackIndex>=0; stackIndex-- ){
            System.out.print(reversedStackCopy.get(stackIndex) + " ");
        }

        System.out.println();
        
    }

    
}
