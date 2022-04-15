// Kseniia Salko
// SPC ID 2431072 

package salko19;

// Importing util module for Scanner and exception handling
import java.util.*;

public class Program19_5 {

	public static void main(String[] args) {
		// Creating new Scanner
		Scanner input = new Scanner(System.in);
		
		// Creating an array to keep 10 integers
		Integer[] myArray = new Integer[10];
		// Boolean variable to control do/while loop
		boolean askAgain = true;
		
		// Do/while loop to prompt user to enter an integer
		do {
			// Trying to run for loop and record all integers
			try {
				// Running loop 10 times to record 10 integers in an array
				for (int i = 0; i < 10; i++) {
					// Asking to enter an integer
					System.out.print("Enter an integer to compare: ");
					// Placing every integer into an array
					myArray[i] = input.nextInt();
				}
				// If all integers were recorded there is no need to run it again
				askAgain = false;
			}
			// Catching InputMismatch exception
			catch (InputMismatchException ex) {
				System.out.println("Incorrect input type! Integer is required!");
				System.out.println("Try again!");
				input.nextLine();
			}
		}
		// If we didn't fill an array with integers - repeating
		while (askAgain);
		
		// Calling a max method and passing array of integers and printing a message
		System.out.print("\nBiggest element in the array is: " );
		System.out.println(max(myArray));
		
		// Closing input
		input.close();

	}
	
	// Implementing max method to find greatest element in array
	public static <E extends Comparable<E>> E max(E[] list) {
		// Setting first element of the array to be a greatest element
		E maxE = list[0];
		// Checking every element in the array
		for (int i = 0; i < list.length; i++) {
			// If there is greater element than a 1st one
			if (maxE.compareTo(list[i]) < 1) {
				// Setting a new greatest element of the array
				maxE = list[i];
			}
		}
		// Returning greatest element in the array
		return maxE;
	}

}

//I worked alone!