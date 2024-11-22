public class BinarySearchCode{
    public static int binarySearch(int nums[],int key){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (nums[mid] == key){
                return mid;
            }else if(nums[mid]<key){
                 start=mid+1;


            }
            else{
                end=mid-1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int nums[]={2,4,6,8,10,14,15,16};
        int key=14;
        System.out.println("index for key found:" + binarySearch(nums, key));
    }
}