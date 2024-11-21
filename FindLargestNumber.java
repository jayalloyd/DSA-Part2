public class FindLargestNumber {
    public static int findLarge(int numbers[]) {
        int largest = Integer.MIN_VALUE; // Initialize to the smallest possible integer value
        for (int i = 0; i < numbers.length; i++) { // Fix: Use i < numbers.length
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("The largest value: " + findLarge(numbers));
    }
}
