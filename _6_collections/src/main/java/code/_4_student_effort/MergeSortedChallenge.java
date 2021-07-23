package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedChallenge {
    public static void main(String[] args) {
        List<Integer> firstList = Arrays.asList(1, 5, 6);
        List<Integer> secondList = Arrays.asList(2, 3, 4);
        List<Integer> firstMergedList = mergeSorted(firstList, secondList);
        for (Integer x : firstMergedList) {
            System.out.print(x + " ");
        }
        System.out.println();
        List<Integer> thirdList = Arrays.asList(1, 5, 6, 7, 8, 9);
        List<Integer> forthList = Arrays.asList(2, 3, 4);
        List<Integer> secondMergedList = mergeSorted(thirdList, forthList);
        for (Integer x : secondMergedList) {
            System.out.print(x + " ");
        }
    }

    public static List<Integer> mergeSorted(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> listMerged = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < firstList.size() && j < secondList.size()) {
            if (firstList.get(i) < secondList.get(j)) {
                listMerged.add(firstList.get(i));
                i++;
            } else {
                listMerged.add(secondList.get(j));
                j++;
            }
        }
        while (i < firstList.size()) {
            listMerged.add(firstList.get(i));
            i++;
        }
        while (j < secondList.size()) {
            listMerged.add(secondList.get(j));
            j++;
        }
        return listMerged;
    }
}
