import java.util.LinkedList;
import java.util.Scanner;

/**
 * Class that constructs a linked list and prompts user to 
 * enter a list of numbers to be added to the stack. 
 * The stack is then sorted and printed.
 * @author Christian Crowley
 * @Version 21.0.0
 * @Since 6/3/2024
 */


public class Linked {
    /**
     * Main Method. The only method.
     * Creates stack, uses scanner to take user input, adds input to stack.
     * Once user is done, linked list is sorted and printed
     * @param args default params, not used
     * @since 6/3/2024
     */
    public static void main(String[] args) {
        
        // Creating Linked List
        LinkedList<Integer> nums = new LinkedList<>();
       
    
        // Opening scanner to ask for input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number, type A when done");
        
        // Prompts user for a number until they are done, adds numbers to Linked List
        while (true) {
            String b = sc.next();
            if (b.equalsIgnoreCase("A")){
                break;
            }

            else {
                int num = Integer.parseInt(b);
                nums.add(num);
            }
            }
        
        /// Sorts linked list
        nums.sort(null);

        // Prints Linked List
        System.out.println(nums);

        // Closes scanner
        sc.close();
    }

}

// To run the program, naviagte to file and enter 'java Linked.java'.
// To create javadocs, enter 'avadoc Linked.java'.
        
        