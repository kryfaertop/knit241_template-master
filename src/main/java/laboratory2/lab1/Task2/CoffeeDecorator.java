package laboratory2.lab1.Task2;

abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee; // Оборачиваемый объект

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public double getCalories() {
        return coffee.getCost();
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
}
