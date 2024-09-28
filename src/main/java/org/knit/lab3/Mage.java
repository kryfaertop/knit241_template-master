package org.knit.lab3;

public class Mage extends Player {

    public Mage(String name) {
        setName(name);
        setHealth(50);
        setMaxHealth(50);
        setALive(true);
        setX(0);
        setY(0);


    }


    @Override
    protected void increaseHealth(int value) {
        int hp = getHealth();
        hp = hp + value;
        setHealth(hp);
    }

    @Override
    protected void decreaseHealth(int value){
        int hp = getHealth();
        hp = hp - value;
        setHealth(hp);

    }

    @Override
    protected void move(int x1, int x2) {

    }
    //health = health + value;
        //if (health < 0){
        //isALive = false;
    //}
}
