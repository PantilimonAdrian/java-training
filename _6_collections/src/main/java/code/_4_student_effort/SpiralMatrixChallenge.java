package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrixChallenge {
    public static void main(String[] args) {
        List<List<Integer>> spiralMatrix = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(12, 13, 14, 5),
                Arrays.asList(11, 16, 15, 6),
                Arrays.asList(10, 9, 8, 7)
        );
        System.out.println("Initial Matrix: ");
        displayMatrix(spiralMatrix);
        displaySpiralOutput(parseSpiralMatrix((spiralMatrix)));
    }

    public static void displayMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (Integer element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void displaySpiralOutput(List<Integer> spiralOutput){
        for (Integer element : spiralOutput){
            if(spiralOutput.get(spiralOutput.size()-1).equals(element)){
                System.out.print(element+".");
            }else{
                System.out.print(element+",");
            }

        }
    }
    public static List<Integer> parseSpiralMatrix(List<List<Integer>> spiralMatrix) {
        List<Integer> spiralInLineOutput = new ArrayList<>();
        if (spiralMatrix.size() == 0) {
            return spiralInLineOutput;
        }
        int startRow = 0;
        int startColumn = 0;
        int row = spiralMatrix.size();
        int column = spiralMatrix.get(0).size();
        while (startRow < row && startColumn < column) {
            for (int i = startColumn; i < row; ++i) {
                spiralInLineOutput.add(spiralMatrix.get(startRow).get(i));
            }
            startRow++;
            for (int i = startRow; i < row; ++i) {
                spiralInLineOutput.add(spiralMatrix.get(i).get(column - 1));
            }
            column--;

            if (startRow < row) {
                for (int i = column - 1; i >= startColumn; --i) {
                    spiralInLineOutput.add(spiralMatrix.get(row - 1).get(i));
                }
                row--;
            }
            if (startColumn < column){
                for (int i = row - 1 ; i >= startRow ;--i){
                    spiralInLineOutput.add(spiralMatrix.get(i).get(startColumn));
                }
                startColumn++;
            }
        }
        return spiralInLineOutput;
    }
}
