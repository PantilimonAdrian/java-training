package code._4_student_effort;

public class RabbitRaceChallenge {
    public static void main(String[] args) {
        startRace();
    }

    public static Thread createRabbitThreads(int rabbitNumber) {
        return new RabbitThread(rabbitNumber);
    }

    public static Thread createRabbitRunnable(int rabbitNumber) {
        RabbitRunnable rabbitRunnable = new RabbitRunnable(rabbitNumber);
        return new Thread(rabbitRunnable);
    }

    public static Thread rabbitStartPosition(int rabbitNumber) {
        if (rabbitNumber % 2 == 0) {
            return createRabbitThreads(rabbitNumber);
        } else {
            return createRabbitRunnable(rabbitNumber);
        }
    }

    public static void makeTheRabbitRun(Thread rabbit) {
        rabbit.start();
    }

    public static void startRace() {
        for (int i = 0; i < 10; i++) {
            Thread rabbit = rabbitStartPosition(i);
            makeTheRabbitRun(rabbit);
        }
    }


}
