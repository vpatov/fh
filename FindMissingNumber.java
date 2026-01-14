
// Access the problem and 'fork' to solve at this link: https://www.jdoodle.com/ga/QtJh9mZ2KKf6motw8JI46A%3D%3D
//
// You have an array of numbers from 0 to N, but one number is missing. Find the missing number.
// Example:
// Input: [0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11]
// Output: 9

// Input: [1, 2, 3, 4, 5, 7, 8, 9, 10]
// Output: 6

// The Challenge:
// Write a method that finds the missing number.

// WARNING                                                                WARNING //
// WARNING: A slow solution might take a YEAR to solve the hard example.  WARNING //
// WARNING                                                                WARNING //

import java.util.ArrayList;
import java.util.List;

public class FindMissing {
    
    // Helper method to create test arrays
    public static int[] createRange(int start, int end, int skipNumber) {
        List<Integer> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            if (i != skipNumber) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public static int findMissing(int[] nums) {
        /// YOUR CODE HERE ////
        System.out.println("YOU DIDN'T WRITE ANY CODE YET!!!!");
        return -1;
    }
    
    public static void main(String[] args) {
        // Easy Example
        int[] easyExample = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 11};
        
        // Medium Example
        int[] mediumExample = createRange(0, 50000, 40000);
        
        // Hard Example
        int[] hardExample = createRange(0, 1000000, 900000);
        
        // Uncomment to run examples
        
        // Easy Example
        // long start = System.nanoTime();
        // System.out.println(findMissing(easyExample));
        // System.out.println("Time to complete easy example: " + 
        //     (System.nanoTime() - start) / 1_000_000_000.0 + " seconds");
        
        // Medium Example
        // start = System.nanoTime();
        // System.out.println(findMissing(mediumExample));
        // System.out.println("Time to complete medium example: " + 
        //     (System.nanoTime() - start) / 1_000_000_000.0 + " seconds");
        
        // Hard Example
        // start = System.nanoTime();
        // System.out.println(findMissing(hardExample));
        // System.out.println("Time to complete hard example: " + 
        //     (System.nanoTime() - start) / 1_000_000_000.0 + " seconds");
    }
}
