package org.knit.lab3;

public class Task6 {

    public static void main(String[] args) {
        Mage mag = new Mage("Gendalf");
        System.out.println(mag.getHealth());
        mag.increaseHealth(15);
        System.out.println(mag.getHealth());
        mag.decreaseHealth(15);
        System.out.println(mag.getHealth());
    }


}