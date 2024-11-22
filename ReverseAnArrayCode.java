public class ReverseAnArrayCode{
    public static void reverseAnArray(int nums[]){
      int start=0;
        int end=nums.length-1;
        while(start< end){

            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;

    }}
    public static void main(String[] args) {
        int nums[]={3,4,7,8,10,11};
        reverseAnArray(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");

        }
        System.out.println();
        }
    }
