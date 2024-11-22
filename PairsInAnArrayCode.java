public class PairsInAnArrayCode {
    public static void pairsInAnArray(int nums[]) {
                            int tp=0;

        for (int i = 0; i < nums.length; i++) {

            int curr = nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + curr + "," + nums[j] + ") ");
                tp++;
            }
            System.out.println(); // Move to the next line after printing all pairs for a number
        }
                    System.out.print("The total number of pairs: " + tp);

    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 10};
        pairsInAnArray(nums); // Call the method
    }
}
