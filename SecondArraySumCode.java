// Print out the sum of the numbers inthe second row of the “nums” array.Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} }
public class SecondArraySumCode {
    public static void main(String[] args) {
        int sum=0;
    
    int [] [] nums= { {1,4,9},{11,4,3},{2,2,3} };
    //sum of 2nd row elements
    for(int j=0;j<nums[0].length;j++) {
            

        sum+=nums[1][j];
    }
    System.out.print(sum);
}}