public class PrintSubArrayCode {
    public static void printSubArray(int nums[]){
        int ts=0;//total subarrays
        for(int i=0;i<nums.length;i++){
            
            int start=i;
            for (int j=i; j<nums.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){//print
                    System.out.print(nums[k]+" ");
                }ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("total subarrays:"+ts);
    }
    public static void main(String[] args) {
      int nums[]={2,4,6,8,20};
      printSubArray(nums);
    }
}
