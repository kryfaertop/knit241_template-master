package laboratory2.lab2.Task8;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        TrafficController controller = new TrafficController(trafficLight);
        controller.start();

        for (int i = 1; i <= 5; i++) {
            Car car = new Car(trafficLight, "Машина " + i);
            car.start();
        }
    }
}

