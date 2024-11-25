public class MajorityElementCode {
    public static int majorityElement(int[] nums) {
        int count =0;
        int curr = nums[0];

        for(int i=0;i<nums.length;i++)
        {
            
            if(curr == nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
            if(count==-1)
            {
                curr = nums[i];
                count =0;
            }
        }
    
    return curr;
    }
public static void main(String[] args) {
    int [] nums={3,1,1,2,3,3};
    majorityElement(nums);
     
}}


// //leetcode problem number : 169 ->Boyer-Moore Voting Algorithm to find the majority element in an array. This algorithm is efficient and operates in 
// �
// (
// �
// )
// O(n) time complexity with 
// �
// (
// 1
// )
// O(1) space complexity. Here's an explanation of the code:

// Explanation:
// Initialization:

// count is initialized to 0.
// curr is initialized to the first element of the array, nums[0].
// Iterating through the array:

// For each element in the array:
// If the current element (nums[i]) matches the candidate (curr), increase the count.
// Otherwise, decrease the count.
// If count becomes -1, it implies the candidate (curr) no longer has majority support:
// Update curr to the current element.
// Reset the count to 0 (effectively starting a new "vote" phase).
// Return the candidate:

// After iterating through the array, the algorithm returns curr, which should be the majority element if one exists.
// Assumptions and Constraints:
// The algorithm assumes that a majority element always exists (i.e., an element appears more than 
// �
// /
// 2
// n/2 times in the array). If this assumption doesn't hold, the algorithm might return an incorrect result.


/*Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 

Follow-up: Could you solve the problem in linear time and in O(1) space? */
