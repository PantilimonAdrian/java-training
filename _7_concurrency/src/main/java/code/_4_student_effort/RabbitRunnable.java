package code._4_student_effort;

public class RabbitRunnable implements Runnable {
    private int numberOfRabbit;

    public RabbitRunnable(int nr) {
        this.numberOfRabbit = nr;
    }

    @Override
    public void run() {
        System.out.println("Rabbit " + numberOfRabbit + " is running.");
    }
}
