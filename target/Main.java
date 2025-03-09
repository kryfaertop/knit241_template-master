interface Coffee {
    double getCost();

    String getDescription();
}

class Espresso implements Coffee {
    @Override
    public double getCost() {
        return 5.00;
    }

    @Override
    public String getDescription() {
        return "Эспрессо ";
    }
}

// 3. Абстрактный класс-декоратор (наследуется от Pizza)
abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza; // Оборачиваемый объект

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}

// 4. Конкретные декораторы (добавки)
class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.50; // Добавляем цену сыра
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", сыр";
    }
}

class Olives extends PizzaDecorator {
    public Olives(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75; // Добавляем цену оливок
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", оливки";
    }
}

class Bacon extends PizzaDecorator {
    public Bacon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.00; // Добавляем цену бекона
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", бекон";
    }
}

public class Main {
    public static void main(String[] args) {
        // Базовый кофе
        Coffee coffee = new Espresso();
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        // Добавляем размер (medium)
        coffee = new SizeDecorator(coffee, "medium");
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        // Добавляем молоко
        coffee = new Milk(coffee);
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        // Добавляем карамель
        coffee = new Caramel(coffee);
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");

        // Добавляем шоколад
        coffee = new Chocolate(coffee);
        System.out.println(coffee.getDescription() + " | Цена: $" + coffee.getCost() + " | Калорийность: " + coffee.getCalories() + " ккал");
    }
}
