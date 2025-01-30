// Print the number of 7’s that are inthe 2d array.Example :Input - int[][] array = { {4,7,8},{8,8,7} }
public class PrintNoOfTimesElementCode{

    
    public static void main(String[] args) {
        int array[][]={{4,7,8},{8,8,7}};
        int countOfNum=0;
        for(int i=0;i< array.length;i++) {
            for(int j=0;j<array[0].length;j++) {
                if(array[i][j] ==8) {countOfNum++;
                }
            }
        }
        System.out.println(countOfNum);    
        }}
