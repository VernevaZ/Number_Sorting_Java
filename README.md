# Number Sorting Manager

Project gathers user integer input and stores it in ascending order using either a linked list or a stack. It demonstrates code reusability and flexibility by defining a common NumberSorter interface that both a linked list and a stack can implement. Project utilized Java's built-in linked list and stack classes to implement reusability and efficiently manage values. 
Several built-in methods also exemplify code reusability including, but not limited to, get(), push(), pop(), and trim(). 
Java's built-in Scanner is also reused to gather user input.

## How to Run

1. Compile Java files: `javac *.java`
2. Run program: `java Main`

## How to Run JavaDocs
1. Compile Java files: `javadoc -d doc -private *.java`
2. Open file in browser: `open doc/index.html`


## About

This project interchanges between Java's LinkedList and Stack classes to sort integers. Reusability is explicity called out in both the JavaDoc and inline comments.

## Design Overview

- **`NumberSorter` interface**: Defines reusable methods to insert integers in ascending order and print sorted values.
- **`LinkedListSorter` class**: Implements `NumberSorter` using Java's built-in `LinkedList`.
- **`StackSorter` class**: Implements `NumberSorter` using Java's built-in `Stack`.
- **`Main` class**: Acts as the program entry point and instantiates a `NumberSorter` implementation (currently using `StackSorter` but can easily switch to `LinkedListSorter`).

## Switching Implementations

The Main class uses a NumberSorter reference to interact with the sorting logic. Changing only one line of code allows the user to switch between the stack and linked list options.

// Use StackSorter implementation
NumberSorter sortedValues = new StackSorter();

// Use LinkedListSorter implementation
// NumberSorter sortedValues = new LinkedListSorter();

## Author

Verneva Ziga and ChatGPT
