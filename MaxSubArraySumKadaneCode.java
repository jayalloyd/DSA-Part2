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
    
    public static void main(String[] args) {
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        kadaneAlgo(nums);
        // printSubArray(nums);
    }
}
