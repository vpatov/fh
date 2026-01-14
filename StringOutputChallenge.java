// Go to this link to do challenge: https://www.jdoodle.com/ga/OsEBDitpLOkqMJHxMDn%2B7A%3D%3D

// MULTI-PART PATTERN CHALLENGE
// Complete all three methods below to create different patterns

public class PatternChallenge {
    
    // ============================================================================
    // PART 1: Print Numbers 1 to N
    // ============================================================================
    // Print all integers from 1 to N, each on its own line
    // Example:
    // printNumbers(5) should output:
    // 1
    // 2
    // 3
    // 4
    // 5
    
    public static void printNumbers(int n) {
        /// YOUR CODE HERE ///
    }
    
    
    // ============================================================================
    // PART 2: ASCII Box
    // ============================================================================
    // Create a square box using asterisks (*) with side length n
    // Example:
    // printBox(5) should output:
    // *****
    // *   *
    // *   *
    // *   *
    // *****
    
    public static void printBox(int n) {
        /// YOUR CODE HERE ///
    }
    
    
    // ============================================================================
    // PART 3: Number Spiral
    // ============================================================================
    // Create a spiral pattern that goes: right → down → left → up → right...
    // The spiral should contain numbers 1 through n*n
    // 
    // Example:
    // printSpiral(3) should output:
    // 1 2 3
    // 8 9 4
    // 7 6 5
    //
    // Example:
    // printSpiral(4) should output:
    //  1  2  3  4
    // 12 13 14  5
    // 11 16 15  6
    // 10  9  8  7
    //
    // Hint: Think about going right, then down, then left, then up, repeat!
    
    public static void printSpiral(int n) {
        /// YOUR CODE HERE ///
    }
    
    
    // ============================================================================
    // TEST YOUR SOLUTIONS
    // ============================================================================
    
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("PART 1: Numbers 1 to 10");
        System.out.println("==================================================");
        printNumbers(10);
        
        System.out.println("\n==================================================");
        System.out.println("PART 2: Box with side length 7");
        System.out.println("==================================================");
        printBox(7);
        
        System.out.println("\n==================================================");
        System.out.println("PART 3: Spiral 5x5");
        System.out.println("==================================================");
        printSpiral(5);
        
        System.out.println("\n==================================================");
        System.out.println("BONUS: Large Spiral 10x10");
        System.out.println("==================================================");
        printSpiral(10);
    }
}
```

**Expected Output:**
```
==================================================
PART 1: Numbers 1 to 10
==================================================
1
2
3
4
5
6
7
8
9
10

==================================================
PART 2: Box with side length 7
==================================================
*******
*     *
*     *
*     *
*     *
*     *
*******

==================================================
PART 3: Spiral 5x5
==================================================
 1  2  3  4  5
16 17 18 19  6
15 24 25 20  7
14 23 22 21  8
13 12 11 10  9

==================================================
BONUS: Large Spiral 10x10
==================================================
 1  2  3  4  5  6  7  8  9 10
36 37 38 39 40 41 42 43 44 11
35 64 65 66 67 68 69 70 45 12
34 63 84 85 86 87 88 71 46 13
33 62 83 96 97 98 89 72 47 14
32 61 82 95100 99 90 73 48 15
31 60 81 94 93 92 91 74 49 16
30 59 80 79 78 77 76 75 50 17
29 58 57 56 55 54 53 52 51 18
28 27 26 25 24 23 22 21 20 19
