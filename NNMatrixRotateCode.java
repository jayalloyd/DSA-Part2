// given a n*n matrix each pixel in the image is 4 bytes.write a method to rotate the image by 90 degree can u do this in place?

public class NNMatrixRotateCode {
    public static void nnMatrixRotate(int [][] matrix){
        int n= matrix.length;
    for(int i=0; i<n ;i++ ){         // Traverse the upper triangle of the matrix

        for (int j=i+1; j< n;j++){
            int temp=matrix[i][j];                 // Swap elements symmetrically across the diagonal

            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
            
        }
    }        
    }

       
    
    // Utility function to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
    
    // Example matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
         // Transpose the matrix
        nnMatrixRotate(matrix);

        System.out.println("Transposed Matrix:");
        printMatrix(matrix);
    }

}
