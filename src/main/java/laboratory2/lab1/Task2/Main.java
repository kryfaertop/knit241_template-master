package laboratory2.lab1.Task2;

public class Main {
    public static void main(String[] args) {
        // Базовый кофе
        Coffee coffee = new Espresso();
        System.out.println(coffee);

        // Добавляем размер (medium)
        coffee = new SizeDecorator(coffee, "medium");
        System.out.println(coffee.toString());

        // Добавляем молоко
        coffee = new Milk(coffee);
        System.out.println(coffee);

        // Добавляем карамель
        coffee = new Caramel(coffee);
        System.out.println(coffee);

        // Добавляем шоколад
        coffee = new Chocolate(coffee);
        System.out.println(coffee);
    }
}