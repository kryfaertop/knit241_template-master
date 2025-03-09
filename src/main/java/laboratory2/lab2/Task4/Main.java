package laboratory2.lab2.Task4;

public class Main {
    public static void main(String[] args) {
        GasStation gasStation = new GasStation();

        for (int i = 0; i < 5; i++) {
            Car car = new Car(gasStation, "Машина " + (i + 1));
            car.start();
        }
    }
}


