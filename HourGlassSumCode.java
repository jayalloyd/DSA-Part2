// <!-- You are given a  2D array. An hourglass in an array is a portion shaped like this:

// a b c
//   d
// e f g
// For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 0
// 0 0 0 0 0 0
// Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

// 1 1 1     1 1 0     1 0 0
//   1         0         0
// 1 1 1     1 1 0     1 0 0
// The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

// In this problem you have to print the largest sum among all the hourglasses in the array.

// Input Format

// There will be exactly  lines, each containing  integers seperated by spaces. Each integer will be between  and  inclusive.

// Output Format

// Print the answer to this problem on a single line.

// Sample Input

// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 2 4 4 0
// 0 0 0 2 0 0
// 0 0 1 2 4 0
// Sample Output

// 19
// Explanation

// The hourglass which has the largest sum is:

// 2 4 4
//   2
// 1 2 4 -->
// Code Explanation
// Imagine we have a 6×6 2D array (or larger), and we want to find the maximum sum of an hourglass shape inside it.

// An hourglass in a matrix looks like this:

// css
// Copy
// Edit
// a b c
//   d
// e f g
// Each hourglass is made up of 7 numbers:

// Top row: 3 consecutive numbers → a, b, c
// Middle row: 1 number → d
// Bottom row: 3 consecutive numbers → e, f, g
// Example Matrix:
// Copy
// Edit
// 1 1 1 0 0 0
// 0 1 0 0 0 0
// 1 1 1 0 0 0
// 0 0 2 4 4 0
// 0 0 0 2 0 0
// 0 0 1 2 4 0
// 📌 One of the hourglasses in this matrix is:

// Copy
// Edit
// 1 1 1
//   1
// 1 1 1
// The sum of this hourglass is:
// 1 + 1 + 1 + 1 + 1 + 1 + 1 = 7

// Our goal is to find the hourglass with the highest sum in the entire matrix.

// 📌 How the Java Code Works
// Now, let's break down the Java solution step by step.

// 1️⃣ Method to Compute Maximum Hourglass Sum
// java
// Copy
// Edit
// public static int maxHourglassSum(int[][] arr) {
//     int rows = arr.length;
//     int cols = arr[0].length;
//     int maxSum = Integer.MIN_VALUE; // Initialize with smallest possible value
// We find the number of rows and columns in the matrix.
// We set maxSum to the smallest possible integer (Integer.MIN_VALUE) so that any hourglass sum we find will be larger.
// 2️⃣ Loop Through Possible Hourglass Positions
// java
// Copy
// Edit
//     for (int i = 0; i < rows - 2; i++) {
//         for (int j = 0; j < cols - 2; j++) {
// We loop through every possible "top-left" position of an hourglass in the matrix.
// The -2 ensures we don’t go out of bounds since an hourglass needs 3 rows and 3 columns.
// 3️⃣ Compute Each Hourglass Sum
// java
// Copy
// // Edit
//     int hourglassSum = arr[i][j]   + arr[i][j+1]   + arr[i][j+2] // Top row
//                      + arr[i+1][j+1]                          // Middle row
//                      + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]; // Bottom row
// We extract the 7 elements that make up the hourglass and sum them up.
// For example, when i=0 and j=0, the hourglass will be:

// css
// Copy
// Edit
// arr[0][0] arr[0][1] arr[0][2]  
//           arr[1][1]  
// arr[2][0] arr[2][1] arr[2][2]
// Which means the sum is:

// css
// Copy
// Edit
// arr[0][0] + arr[0][1] + arr[0][2]  
// + arr[1][1]  
// + arr[2][0] + arr[2][1] + arr[2][2]
// 4️⃣ Update Maximum Hourglass Sum
// java
// Copy
// Edit
//     maxSum = Math.max(maxSum, hourglassSum);
// We update maxSum if we find an hourglass with a larger sum.
// 5️⃣ Return the Maximum Sum
// java
// Copy
// Edit
//     return maxSum;
// }
// After checking all possible hourglasses, we return the maximum sum found.


public class HourGlassSumCode {
    public static int maxHourglassSum(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int maxSum = Integer.MIN_VALUE; // Initialize to smallest integer value

        // Traverse the 2D array, stopping at valid hourglass centers
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                // Compute hourglass sum
                int hourglassSum = arr[i][j]   + arr[i][j+1]   + arr[i][j+2]
                                 + arr[i+1][j+1] 
                                 + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                maxSum = Math.max(maxSum, hourglassSum); // Update max sum if larger
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 2, 4, 4, 0},
            {0, 0, 0, 2, 0, 0},
            {0, 0, 1, 2, 4, 0}
        };

        System.out.println("Max Hourglass Sum: " + maxHourglassSum(matrix)); // Output: 19
    }
}




