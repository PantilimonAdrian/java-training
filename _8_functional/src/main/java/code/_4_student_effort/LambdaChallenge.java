package code._4_student_effort;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class LambdaChallenge {
    public static void main(String[] args) {
        runChallenge();
    }

    private static void runChallenge() {
        System.out.println("Running solution for exercise 1 ...");
        exercise1();
        System.out.println("Running solution for exercise 2 ...");
        exercise2();
        System.out.println("Running solution for exercise 3 ...");
        exercise3();
        System.out.println("Running solution for exercise 4 ...");
        exercise4();
        System.out.println("Running solution for exercise 5 ...");
        exercise5();
    }

    private static void exercise5() {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        new Thread(new Task(numberList)).start();
    }

    private static void exercise4() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        String result = map.entrySet().stream()
                .map(entry -> entry.getKey() + entry.getValue())
                .collect(Collectors.joining());
        System.out.println("Exercise 4 result : " + result);

    }


    private static void exercise3() {
        List<String> words = Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

        List<String> collect = words.stream()
                .map(String::toUpperCase)
                .collect(toList());
        System.out.println("Exercise 3 result : ");
        collect.forEach(System.out::println);
//        OR
//        words.replaceAll(String::toUpperCase);
//        words.forEach(System.out::println);

    }

    private static void exercise2() {
        List<String> words = Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");


        List<String> collect = words.stream()
                .filter(word -> word.length() % 2 == 0)
                .collect(toList());
        System.out.println("Exercise 2 output : " + collect);

//        Or this:
//        words.removeIf(word ->word.length()%2 == 1);
//        for (String word : words) {
//            System.out.println(word);
//        }
    }

    private static void exercise1() {
        List<String> words = Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

        String result = words.stream().
                map(word -> word.substring(0, 1))
                .collect(Collectors.joining());
        System.out.println("Exercise 1 output : " + result);
    }
}

class Task implements Runnable {

    List<Integer> list;

    public Task(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        this.list.forEach(System.out::println);
    }
}
