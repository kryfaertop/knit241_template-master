package laboratory2.lab1.Task2;

class Chocolate extends CoffeeDecorator {
    public Chocolate(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.00; // Добавляем цену бекона
    }

    public double getCalories() {
        return super.getCost() + 80.00; // Добавляем цену сыра
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", шоколад";
    }
}
