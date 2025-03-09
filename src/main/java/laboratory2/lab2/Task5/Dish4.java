package laboratory2.lab2.Task5;

public class Dish4 extends Thread{
    private final Waiter waiter;
    private final String name = "Компот";

    public Dish4(Waiter waiter) {
        this.waiter = waiter;
    }


    @Override
    public void run() {
        try {
            System.out.println(name + " добавлено в очередь на готовку....");
            waiter.acquireDish(name);
            Thread.sleep(500);
            waiter.releaseDish(name);
            System.out.println(name + " передано официанту.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
