import java.util.Scanner; // Import Java's built-in Scanner class for code reusability 

/**
 * Main class which is the entry point for the program. 
 * It gathers user input, then instantiates a class that implements the 
 * {@link NumberSorter} interface (such as {@code StackSorter} or 
 * {@code LinkedListSorter}), and calls the {@code insertAscending} 
 * method to sort user input in ascending order.
 *
 * Version History:  
 * 1.0.0 - Initially written with support from ChatGPT by OpenAI 
 * particularly when finding methods to improve reusability.
 * 1.1.0 - Documentation improved with support from ChatGPT by 
 * OpenAI.
 * 1.2.0 - Added a {@link NumberSorter} interface to improve maintainability 
 * through polymorphism. Added {@code StackSorter} class using stack 
 * functionality. Updated class, function, and variable names to reflect 
 * updated maintainability. 
 * 
 * @author Verneva Ziga and ChatGPT
 * @since Week 6 of CSC6301
 * @version 1.2.0
 */
public class Main {
    /**
     * Main method of the class.
     * Executes input loop where valid integers are sent to {@link NumberSorter} 
     * instance, which maintains sorted linked list or stack.
     *
     * @param args Default parameter for the main method - not used.
     * @since Week 5 of CSC6301
     */
    public static void main(String[] args) {

        // Swap between LinkedListSorter or StackSorter here:
        NumberSorter sortedValues = new StackSorter();
        // Create a new instance of a StackSorter class to store sorted integers

        Scanner scanner = new Scanner(System.in); // Implementing code reusability by instantiating a scanner object to read user input 

        while (true) {
            System.out.println("Enter an integer to sort or 'Exit' to finish: "); // Prompt for user input

            String userInput = scanner.nextLine().trim(); // Read user input and trim spaces

            if (userInput.equalsIgnoreCase("Exit")) {
                break; // Exit the loop
            }

            // Implementing code reusability with Java's built-in NumberFormatException and try-catch mechanism.
            try {
                int valueToInsert = Integer.parseInt(userInput); // Implementing code reusability with the parseInt() to convert input string to integer 

                sortedValues.insertAscending(valueToInsert); // Insert input in ascending order
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer or 'exit' to finish");
            }
        }

        scanner.close(); // Close the scanner

        System.out.println("Sorted values: ");
        sortedValues.printSortedValues(); // Print all numbers in now sorted list
    }
}

