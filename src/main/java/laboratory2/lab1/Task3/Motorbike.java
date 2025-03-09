package laboratory2.lab1.Task3;

class Motorbike implements Transport {
    private String specifications;

    public Motorbike() {
        this.specifications = "Motorbike: предназначен для быстрой доставки";
    }

    @Override
    public String getSpecifications() {
        return specifications;
    }
}
