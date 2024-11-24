public class MaxSubArraySumCode{
    public static void printSubArray(int nums[]) {
        int ts = 0; // Total subarrays
        int minSum = Integer.MAX_VALUE; // Initialize minimum subarray sum
        int maxSum = Integer.MIN_VALUE; // Initialize maximum subarray sum
        
        for (int i = 0; i < nums.length; i++) {//start of sub array
            int start = i;
            for (int j = i; j < nums.length; j++) {//end of sub array
                int end = j;
                int sum = 0; // Initialize sum for the current subarray
                
                // Print elements of the subarray and calculate the sum
                for (int k = start; k <= end; k++) {
                    System.out.print(nums[k] + " ");
                    sum += nums[k];
                }
                System.out.println(" -> Sum: " + sum);
                
                // Update min and max sums
                if (sum < minSum) {
                    minSum = sum;
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
                
                ts++; // Increment total subarrays count
            }
            System.out.println(); // Separate subarrays by starting index
        }
        
        // Print results
        System.out.println("Total subarrays: " + ts);
        System.out.println("Minimum subarray sum: " + minSum);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,6,-1,3};
        printSubArray(nums);
    }
}

// brute force approach
