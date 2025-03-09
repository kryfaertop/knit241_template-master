package laboratory2.lab1.Task3;

public class Task3 {
    public static void main(String[] args) {
        try {
            Transport businessCar = TransportFactory.createTransport("business");
            System.out.println(businessCar.getSpecifications());

            Transport familyVan = TransportFactory.createTransport("family");
            System.out.println(familyVan.getSpecifications());

            Transport motorbike = TransportFactory.createTransport("delivery");
            System.out.println(motorbike.getSpecifications());

            // Тест на неизвестный тип
            TransportFactory.createTransport("неизвестный тип");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
