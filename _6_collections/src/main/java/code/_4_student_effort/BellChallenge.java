package code._4_student_effort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BellChallenge {
    public static void main(String[] args) throws Exception {
        List<List<Integer>> bellTriangleTest = generateBellTriangle(10);
        for (List<Integer> row : bellTriangleTest){
            for (Integer colon : row){
                System.out.print(colon + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> generateBellTriangle(int numberOfRows) throws Exception {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> aboveRow = new ArrayList<>();
        if (numberOfRows <= 0) {
            throw new Exception("Invalid number of rows for Bell Triangle generator.");
        }else{
            triangle.add(Collections.singletonList(1));
            for (int i = 1; i < numberOfRows;i ++){
                aboveRow = triangle.get(i-1);
                List<Integer> currentRow = new ArrayList<>();
                currentRow.add(aboveRow.get(i-1));
                for (int j = 1; j <= i; j++){
                    currentRow.add(currentRow.get(j-1)+aboveRow.get(j-1));
                }
                triangle.add(currentRow);
            }
        }
        return triangle;
    }
}
