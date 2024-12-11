import java.util.Scanner;

public class MatricesEXample2DArrayCode {
    public static boolean search(int [][]matrix,int key){
      for(int i=0;i<matrix.length;i++){
        for (int j=0;j<matrix[0].length;j++){
         if (matrix[i][j]==key){
            System.out.print("Element found at:"+i +","+j);
            return true;
         }
        }
        System.out.println();
     }
         return false;
     
    }


    public static int smallestNumber(int[][] matrix){
        int smallest=Integer.MAX_VALUE;
        int smallestRow=-1;
        int smallestCol=-1;
        
        for(int i=0;i<matrix.length;i++){
        for (int j=0;j<matrix[0].length;j++){
           int a= matrix[i][j];
            if (a <smallest) {
                smallest = a;
           smallestRow = i;
               smallestCol = j;
            }
            
    }}System.out.print("Smallest Number is "+smallest +"Found at:" +smallestRow +","+smallestCol);
            return smallest;
}
    
    public static int largestNumber(int [] [] matrix){
        int largest=Integer.MIN_VALUE;    
        int largestRow=-1;
         int largestCol = -1;

        for(int i=0;i<matrix.length;i++){
        for (int j=0;j<matrix[0].length;j++){
           int a= matrix[i][j];
            if (a > largest) {
                largest = a;
                largestRow = i;
                largestCol = j;
            }
            
    }}System.out.print("Largest Number is "+largest +"Found at:" +largestRow +","+largestCol);
            return largest;
}
    public static void main(String[] args) {
    
     Scanner in=new Scanner(System.in);
     int [][] matrix=new int [3] [3];
           int n=matrix.length;
     int m=matrix[0].length;
     for(int i=0;i<n;i++){
        for (int j=0;j<m;j++){

            matrix[i][j]=in.nextInt();
        }
     }
      for(int i=0;i<n;i++){ 
        for (int j=0;j<m;j++){
           System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
     }
      search(matrix, 2);
largestNumber(matrix); 
smallestNumber(matrix);
in.close();
    }
}
