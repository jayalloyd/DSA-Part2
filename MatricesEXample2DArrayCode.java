import java.util.Scanner;

public class MatricesEXample2DArrayCode {
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
   

    }
}
