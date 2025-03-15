package laboratory2.lab1.Task2;

class Espresso implements Coffee {
    @Override
    public String toString() {
        return this.getDescription() + " | Цена: $" + this.getCost() + " | Калорийность: " + this.getCalories() + " ккал";
    }

    @Override
    public double getCost() {
        return 2.5;
    }

    @Override
    public String getDescription() {
        return "Эспрессо";
    }

    @Override
    public double getCalories() {
        return 5.00;
    }
}
