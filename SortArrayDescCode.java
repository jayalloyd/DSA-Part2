public class SortArrayDescCode {
//      public static void bubbleSort(int[] arr){
//   for(int turn=0;turn<arr.length-1;turn++)       {
//             for(int j=0;j<arr.length-1-turn;j++){
//                 // int swap=0;
//                 if(arr[j]<arr[j+1]){
//                     //swap
//                 int temp=arr[j];
//                 arr[j]=arr[j+1];
//                 arr[j+1]=temp;
//                 //  swap++;
//                 //     System.out.print(swap);
//                 }
               
             
//             }
//         }
//         }
    //    
    public static void selectionSort(int [] arr){
       for(int i=0;i<arr.length-1;i++){//turns count
        int minPos=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minPos]<arr[j]){
                minPos=j;
            }
        }
       int temp=arr[minPos];
       arr[minPos]=arr[i];
       arr[i]=temp;
    }}
    public static void insertionSort(int[] arr){
      for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding the correct position to insert
         while(prev>=0 && arr[prev]<curr){
               arr[prev+1]=arr[prev];
               prev--;
         }
         //insertion
         arr[prev+1]=curr;

        }
    }
    public static void countingSort(int[] arr){
        //range
        int largest=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            largest=Math.max(largest,arr[i]);
           
        }
        //counting array
        int[] count=new int[largest+1];//since we are taking only positive nos starts with 0
        for (int i=0;i < n;i++ ){
            count[arr[i]]++;//we are taking number as index and going to countarray to that index doing ++

        }
        //sorting
        int j=0;
        for(int i=count.length-1;i>0;i--){
            //count.length -> point to remember
            while(count[i]>0){
          arr[j]=i;
        j++;
        count[i]--;}
        }
    }

           public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
      }
      


    public static void main(String[] args) {
        int[] arr={3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        selectionSort(arr);
        // countingSort(arr);
        // insertionSort(arr);
        printArr(arr);
    }
}