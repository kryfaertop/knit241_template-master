package org.knit.lab3.src;
class Warrior extends Player implements Attack {
    public Warrior(int x, int y) {
        super("Воин", x, y);
        setHealth(100);
        setMaxHealth(100);
        setALive(true);
        setDamage(50);
        setDeff(10);
        setMaxMove(1);
        setAdditionalDefence(10);
    }

    @Override
    public void attack(Player player) {
        super.attack(player);
        player.decreaseHealth(getDamage());
    }

    @Override
    protected void increaseHealth(int value) {
        if (getHealth() + value > getMaxHealth()) {
            setHealth(getMaxHealth());
        } else if (getHealth() > 0) {
            setHealth(getHealth() + value);
        }
    }

    @Override
    protected void decreaseHealth(int value) {
        int hp = getHealth() + getDeff() + getAdditionalDefence() - value;
        if (hp <= 0) {
            setALive(false);
            setHealth(0);
        } else {
            setHealth(hp);
        }
    }

    @Override
    public void move(int newX, int newY) {
        setPosition(newX, newY);
    }
}
