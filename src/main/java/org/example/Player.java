package org.example;

import org.junit.platform.commons.util.ToStringBuilder;

public class Player {
    String name;
    int healthPercentage;
    String Weapon ;

    public Player(String name,int healthPercentage,String Weapon){
        this.name = name;
        this.healthPercentage = healthPercentage;
        checkHealt(healthPercentage);
        this.Weapon= Weapon;
    }
    private void checkHealt(int healthPercentage){
        if(healthPercentage<0){
            this.healthPercentage=0;
        }
        if (healthPercentage>100){
            this.healthPercentage=100;
        }
    }

    public String getWeapon() {
        return this.Weapon;
    }

    public int healthRemaining(){
            return this.healthPercentage;
        }
    public void loseHealth(int damage){
            int healthRemain = healthPercentage - damage;
            if (healthRemain<0){
                System.out.println(name + " player has been knocked out of game");
            }
            healthPercentage = healthRemain;
            checkHealt(healthPercentage);
        }
    public void restoreHealth(int healthPotion){
            this.healthPercentage += healthPotion;
            checkHealt(this.healthPercentage);
        }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", Weapon='" + Weapon + '\'' +
                '}';
    }


}
