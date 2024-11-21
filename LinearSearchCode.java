public class LinearSearchCode{


    public static int linearSearch(int nums[], int key){
        for(int i=0;i<=nums.length;i++){
            {
                if(nums[i]==key){
                    return i;
                }
            }
          
        }
      return -1;
    }        
                
                    
        
    
    public static void main(String[] args) {
        int nums[]={1,2,6,5,9,5,10};
        int key=10;

        int index=linearSearch(nums, key);
      if(index== -1){
        System.out.println("Not found");
      }
      else{
        System.out.println("the key is  at index:"+index);
      }
    }

}