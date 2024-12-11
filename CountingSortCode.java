public class CountingSortCode{
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
        for(int i=0;i< count.length;i++){
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
        int [] arr={5,4,1,3,2};
       countingSort(arr);
       printArr(arr);
    }
}