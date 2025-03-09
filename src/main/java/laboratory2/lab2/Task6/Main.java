package laboratory2.lab2.Task6;

public class Main {
    public static void main(String[] args) {
        RailroadCrossing crossing = new RailroadCrossing();

        Train train = new Train(crossing);
        train.start();

        for (int i = 1; i <= 5; i++) {
            Car car = new Car(crossing, "Машина " + i);
            car.start();
        }
    }
}
