package org.knit.lab3.src;
public abstract class Player implements Cast, Attack, Heal {
    protected String name;
    protected int x, y; // Позиция фигуры на доске
    private int health;
    private int maxHealth;
    private boolean isALive;
    private int damage;
    private int deff;
    private int maxMove;
    private int additionalDefence;


    public int getAdditionalDefence() {
        return additionalDefence;
    }

    public void setAdditionalDefence(int additionalDefence) {
        this.additionalDefence = additionalDefence;
    }

    public Player(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    @Override
    public void attack(Player player) {

    }

    @Override
    public void cast(Player player) {

    }

    @Override
    public void heal(Player player) {

    }

    public abstract void move(int newX, int newY);

    protected abstract void increaseHealth(int value);

    protected abstract void decreaseHealth(int value);


    public String getName() {
        return name;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public boolean getALive() {
        return isALive;
    }

    public void setALive(boolean ALive) {
        isALive = ALive;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDeff() {
        return deff;
    }

    public void setDeff(int deff) {
        this.deff = deff;
    }

    public int getMaxMove() {
        return maxMove;
    }

    public void setMaxMove(int maxMove) {
        this.maxMove = maxMove;
    }

}
