package org.knit.lab3.src;
class Mage extends Player implements Cast {
    public Mage(int x, int y) {
        super("Маг", x, y);
        setHealth(50);
        setMaxHealth(50);
        setALive(true);
        setDamage(75);
        setDeff(5);
        setMaxMove(2);


    }

    @Override
    protected void increaseHealth(int value) {
        if (getHealth() + value > getMaxHealth()) {
            setHealth(getMaxHealth());
        } else if (getHealth() > 0) {
            setHealth(getMaxHealth() + value);
        }
    }

    @Override
    protected void decreaseHealth(int value) {
        int hp = getHealth() + getDeff() - value;
        if (hp <= 0) {
            setALive(false);
            setHealth(0);
        } else {
            setHealth(hp);
        }
    }


    @Override
    public void cast(Player player) {
        super.cast(player);
        player.decreaseHealth(getDamage());
    }


    @Override
    public void move(int newX, int newY) {
        setPosition(newX, newY);
    }
}
