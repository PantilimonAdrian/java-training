package code._4_student_effort;

import java.util.Arrays;
import java.util.List;

public class MySetChallenge {
    public static void main(String[] args) {
        List<Integer> duplicateList = Arrays.asList(1,3,5,5,3,5,7,9,0,2,6,4,4);

        MySet<Integer> testSet = new MySetImplementation<>();

        for (Integer element : duplicateList){
            testSet.add(element);
        }

        displaySet(testSet);
        System.out.println(testSet.size());
        testSet.remove(0);
        displaySet(testSet);
        System.out.println(testSet.size());
        testSet.set(0,8);
        displaySet(testSet);
        System.out.println(testSet.contains(1));
    }

    public static void displaySet(MySet<Integer> integerSet){
        for (int i = 0; i < integerSet.size();i++){
            System.out.print(integerSet.get(i) + " ");
        }
        System.out.println();
    }
}
