package code._4_student_effort;

public class RabbitThread extends Thread {
    private int numberOfRabbit;

    public RabbitThread(int nr) {
        this.numberOfRabbit = nr;
    }

    @Override
    public void run() {
        System.out.println("Rabbit " + numberOfRabbit + " is running.");
    }
}
