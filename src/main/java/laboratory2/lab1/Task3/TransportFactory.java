package laboratory2.lab1.Task3;

class TransportFactory {
    public static Transport createTransport(String type) {
        switch (type) {
            case "business":
                return new BusinessCar();
            case "family":
                return new FamilyVan();
            case "delivery":
                return new Motorbike();
            default:
                throw new IllegalArgumentException("Unknown: " + type);
        }
    }
}
