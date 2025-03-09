package laboratory2.lab2.Task5;

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();


        Dish1 dish1 = new Dish1(waiter);
        Dish2 dish2 = new Dish2(waiter);
        Dish3 dish3 = new Dish3(waiter);
        Dish4 dish4 = new Dish4(waiter);
        Dish5 dish5 = new Dish5(waiter);
        dish1.start();
        dish2.start();
        dish3.start();
        dish4.start();
        dish5.start();

    }
}
