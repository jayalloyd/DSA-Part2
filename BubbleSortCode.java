public class BubbleSortCode {

      public static void bubbeSort(int [] arr){
        for(int turn=0;turn<arr.length-1;turn++)       {
            for(int j=0;j<arr.length-1-turn;j++){
                int swap=0;
                if(arr[j]>arr[j+1]){
                    //swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                 swap++;
                    System.out.print(swap);
                }
               
             
            }
        }

      }
      public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
      }
      
    public static void main(String[] args) {
        int [] arr={5,4,1,3,2};
        // int [] arr={1,2,3,4,5};
        bubbeSort(arr);
        printArr(arr);
        
    }
}
/* time complexity is O(n2) */