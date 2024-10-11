package org.knit.lab3.src;
class Priest extends Player {
    public Priest(int x, int y) {
        super("Хиллер", x, y);
        setHealth(50);
        setMaxHealth(50);
        setALive(true);
        setDamage(50);
        setDeff(0);
        setMaxMove(2);

    }


    @Override
    public void heal(Player player) {
        super.heal(player);
        player.increaseHealth(getDamage());
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
    public void move(int newX, int newY) {
        setPosition(newX, newY);
    }
}

