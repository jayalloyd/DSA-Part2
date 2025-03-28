public class DiagonalSumDemo {

    public static int diagonalMatrix(int matrix[] [])// O(n^2)
    {int sum=0;
        // for(int i=0; i< matrix.length ; i++)
        // {
            
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum+= matrix[i][j];

        //         }
        //         else if((i+j) == (matrix.length-1)){
        //             sum += matrix[i][j];
        //         }

        //     }
        // }
        for(int i=0; i < matrix.length ; i++){//time complexity is O(n)
            sum += matrix[i][i];//primary diagonal

            //secondary diagonal

            if(i != matrix.length-1-i)//i not equal to j so that middle element wont get added once more middle element is common for n=odd number
             sum+= matrix[i][matrix.length-1-i];
        }
        return sum;
        }
        
    
    public static void main(String[] args) {
        int matrix [] [] ={{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12},
                            {13,14,15,16}};
     System.out.println(diagonalMatrix(matrix));               

    }
}
