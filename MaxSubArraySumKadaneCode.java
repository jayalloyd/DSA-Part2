public class MaxSubArraySumKadaneCode {
    // public static void printSubArray(int nums[]) {
    //     int ts = 0; // Total subarrays
    //                 int currSum=0;

    //     int maxSum = Integer.MIN_VALUE; // Initialize maximum subarray sum
    //     int prefix[]=new int[nums.length];
    //     prefix[0]=nums[0];//zeroth index sum so i=1 iniatializes
    //     //calculate prefix

    //     for(int i=1;i< prefix.length;i++){
    //             prefix[i]=prefix[i-1]+nums[i];
    //     }
        
    //     for (int i = 0; i < nums.length; i++) {//start of sub array
    //         int start = i;
    //         for (int j = i; j < nums.length; j++) {//end of sub array
    //             int end = j;
    //             currSum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];

                
    //             if (maxSum < currSum) {
    //                 maxSum = currSum;
    //             }
                
    //             ts++; // Increment total subarrays count
    //         }
    //         System.out.println(); // Separate subarrays by starting index
    //     }
        
    //     // Print results
    //     System.out.println("Maximum subarray sum: " + maxSum);
    // }
    public static void kadaneAlgo(int nums[]){
        int ms=Integer.MIN_VALUE;//max sum
        int  cs=0;//current sum
       for(int i=0;i<nums.length ; i++){
        cs+=nums[i];
        if(cs<0){
           cs=0;
        }
        ms=Math.max(cs,ms);
        
       }
       System.out.println("our max sub array: "+ms);
    }

    

    public static int smallestNegativeUsingKadane(int[] nums1) {
        int maxNegative = Integer.MIN_VALUE; // Initialize with the smallest possible integer
        int currentSum = 0;

        for (int num : nums1) {
            currentSum += num;

            // Update the maxNegative to the least negative number
            if (num > maxNegative) {
                maxNegative = num;
            }

            // If the currentSum drops below the current element, reset it
            if (currentSum < num) {
                currentSum = num;
            }

            // Also update maxNegative in case currentSum is a better negative subarray
            if (currentSum > maxNegative) {
                maxNegative = currentSum;
            }
        }

        return maxNegative;
    }

    

    public static void main(String[] args) {
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        kadaneAlgo(nums);
        // printSubArray(nums);
        int[] nums1 = {-4, -2, -8, -5, -9};
        int result = smallestNegativeUsingKadane(nums1);
        System.out.println("Smallest Negative Number: " + result);
    }
}
