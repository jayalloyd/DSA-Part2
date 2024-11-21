public class FindLargestNumber {
    public static int findLarge(int numbers[]) {
        int smallest=Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE; // Initialize to the smallest possible integer value -Infinity
        for (int i = 0; i < numbers.length; i++) { // Fix: Use i < numbers.length
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("The smallest number:"+smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};
        System.out.println("The largest value: " + findLarge(numbers));
    }
}
