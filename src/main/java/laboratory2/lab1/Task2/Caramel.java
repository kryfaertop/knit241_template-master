package laboratory2.lab1.Task2;

class Caramel extends CoffeeDecorator {
    public Caramel(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75; // Добавляем цену оливок
    }

    public double getCalories() {
        return super.getCost() + 60.00; // Добавляем цену сыра
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", карамель";
    }
}
