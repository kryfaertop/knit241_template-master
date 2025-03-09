package laboratory2.lab2.Task7;



public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Producer producer = new Producer(warehouse);
        Consumer consumer = new Consumer(warehouse);

        producer.start();
        consumer.start();
    }
}

