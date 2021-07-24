package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class PhilosophersChallenge {

    public static void main(String[] args) {
        List<Chopstick> chopsticks = new ArrayList<>();
        List<Philosopher> philosophers = new ArrayList<>();
        int numberOfResources = 5;

        for (int i = 0; i < numberOfResources; i++) {
            chopsticks.add(new Chopstick());
        }
        for (int i = 0; i < numberOfResources; i++) {
            philosophers.add(new Philosopher(String.valueOf(i + 1), chopsticks.get(i), chopsticks.get((i + 1) % numberOfResources)));
        }

        for (Philosopher philosopher : philosophers) {
            philosopher.start();
        }
    }
}
