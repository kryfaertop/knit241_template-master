package org.knit.lab9.task16;

public class Task16 {
    public static void main(String[] args) {
        int count = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                count ++;
                System.out.println(count + ") " + suit + " " +  rank);
            }
        }
    }

}
