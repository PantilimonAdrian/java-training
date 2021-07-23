package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class PascalChallenge {
    public static void main(String[] args) throws Exception {
        pyramidDisplay(generatePascal(10));
    }

    public static List<List<Integer>> generatePascal(int numberOfRows) throws Exception {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        if (numberOfRows <= 0) {
            throw new Exception("Invalid number of rows for Pascal table generator.");
        } else {
            for (int i = 0; i < numberOfRows; i++) {
                row.add(0, 1);
                for (int j = 1; j < row.size() - 1; j++) {
                    row.set(j, row.get(j) + row.get(j + 1));
                }
                triangle.add(new ArrayList<>(row));
            }
        }
        return triangle;
    }

    public static void pyramidDisplay(List<List<Integer>> triangle) {
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j <= triangle.size() - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" " + triangle.get(i).get(k));
            }
            System.out.println();
        }
    }
}