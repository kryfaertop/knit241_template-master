package laboratory2.lab3.Task10;

import java.util.concurrent.ThreadLocalRandom;

import static laboratory2.lab3.Task10.Race.BARRIER;
import static laboratory2.lab3.Task10.Race.FinishBARRIER;
import static laboratory2.lab3.Task10.Race.finishOrder;

public class Runner implements Runnable {
    private final int runnerNumber;

    public  Runner(int runnerNumber) {
        this.runnerNumber = runnerNumber;
    }
    @Override
    public void run() {
        try {
            BARRIER.await();
            System.out.println("Бегун номер: " + runnerNumber + " побежал");
            Thread.sleep(ThreadLocalRandom.current().nextInt(500, 3000));
            if (finishOrder == 0) {
                finishOrder = runnerNumber;
            }
            FinishBARRIER.await();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
