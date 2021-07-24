package code._4_student_effort;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Player extends Thread {
    private String name;
    private String option;

    public Player(String name) {
        this.name = name;
    }

    public String getPlayerName() {
        return name;
    }

    public String getOption() {
        return option;
    }

    @Override
    public void run() {
        List<String> options = Arrays.asList("rock", "paper", "scissors");
        this.option = options.get(new Random().nextInt(3));
    }
}
