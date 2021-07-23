package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeadersChallenge {

    public static void main(String[] args) {
        List<Integer> testArray = Arrays.asList(2, 9, 3, 5, 6, 8, 7, 4, 1);
        System.out.println(getLeaders(testArray));
    }

    public static List<Integer> getLeaders(List<Integer> arrayList) {
        List<Integer> leadersList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            boolean markLeader = true;
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i) < arrayList.get(j)) {
                    markLeader = false;
                    break;
                }
            }
            if (markLeader) {
                leadersList.add(arrayList.get(i));
            }

        }
        return leadersList;
    }
}
