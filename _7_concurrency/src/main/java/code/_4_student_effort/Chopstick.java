package code._4_student_effort;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {
    private Lock lockChopstick = new ReentrantLock(true);

    public boolean lock() {
        lockChopstick.lock();
        return true;
    }

    public void unlock() {
        lockChopstick.unlock();
    }
}
