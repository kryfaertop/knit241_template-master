package laboratory2.lab3.Task10;
import static laboratory2.lab3.Task10.Race.registerFinish;

public class FinishRace implements Runnable {
    @Override
    public void run() {
        try {System.out.println("Все бегуны финишировали!");
            Thread.sleep(2000);
            registerFinish();
        } catch (InterruptedException e) {
        }
    }
}
