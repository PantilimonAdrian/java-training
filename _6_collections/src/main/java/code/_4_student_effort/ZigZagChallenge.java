package code._4_student_effort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ZigZagChallenge {
    public static void main(String[] args) {
        System.out.println(zigZag(Arrays.asList(4, 3, 7, 8, 6, 2, 1)));
        System.out.println(zigZag(Arrays.asList(1, 4, 3, 2)));
    }

    public static List<Integer> zigZag(List<Integer> array) {
        boolean relation = true;
        /* if relation is true "<" is expected otherwise ">" is expected */
        for (int i = 0; i < array.size() - 1; i++) {
            if (relation) {
                if (array.get(i) > array.get(i + 1)) {
                    Collections.swap(array, i, i + 1);
                }
            } else {
                if (array.get(i) < array.get(i + 1)) {
                    Collections.swap(array, i, i + 1);
                }
            }
            relation = !relation;
        }
        return array;
    }
}
