package org.example;

public enum Weapon {
    SWORD(20,4),
    SARS(50,60);

    private int damage;
    private double attackSpeed;


     Weapon(int damage, double attackSpeed){
        this.attackSpeed = attackSpeed;
        this.damage= damage;
    }

    public int getDamage() {
        return this.damage;
    }

    public double getAttackSpeed() {
        return this.attackSpeed;
    }
}
