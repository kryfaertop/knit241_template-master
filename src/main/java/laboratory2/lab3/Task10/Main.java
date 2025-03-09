package laboratory2.lab3.Task10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static laboratory2.lab3.Task10.Race.Const;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(Const);

        for (int i = 1; i <= Const; i++) {
            executor.execute(new Runner(i));
        }

        executor.shutdown();


    }
}

