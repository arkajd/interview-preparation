// You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
// Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.

package Matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixAddition {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 2, 3)),
                new ArrayList<>(Arrays.asList(4, 5, 6)),
                new ArrayList<>(Arrays.asList(7, 8, 9))
        ));
        ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(9, 8, 7)),
                new ArrayList<>(Arrays.asList(6, 5, 4)),
                new ArrayList<>(Arrays.asList(3, 2, 1))
        ));
        ArrayList<ArrayList<Integer>> result = addMatrices(matrix1, matrix2);

        if(result!=null){
            printMatrix(result);
        }
    }

    private static ArrayList<ArrayList<Integer>> addMatrices(ArrayList<ArrayList<Integer>> matrix1, ArrayList<ArrayList<Integer>> matrix2){
        
        // input validation
        if(matrix1.size()!=matrix2.size()){
            return null;
        }
        if(matrix1.size()==0){
            return new ArrayList<>();
        }
        int rows = matrix1.size();
        int columns = matrix1.get(0).size();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        // add values and store in resultant matrix
        for(int i=0; i<rows; i++){
            result.add(new ArrayList<>());
            for(int j=0; j<columns; j++){
                int sum = matrix1.get(i).get(j) + matrix2.get(i).get(j);
                result.get(i).add(sum);
            }
        }
        return result;
    }

    private static void printMatrix(ArrayList<ArrayList<Integer>> matrix){
        int rows = matrix.size();
        int columns = matrix.get(0).size();

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(matrix.get(i).get(j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
