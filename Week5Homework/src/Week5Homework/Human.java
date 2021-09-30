package Week5Homework;

public class Human implements Character {

    private int health;
    private static int ammo;
    boolean isDead;

 public Human() {
    this.health = 100;
    this.ammo = 200;
 }

    @Override
    public int getHealth() {
        return health;
    }

    public static int getAmmo() {
        return ammo;
    }

    @Override
    public int setHealth() {
        health = health - Alien.biteHuman();
        if(health <=0){
            health = 0;
            isDead();
        }
        return health;
    }

    @Override
    public boolean isDead() {
        if(health <=0) {
            isDead = true;
            System.out.println("The Human is dead!");
        } else {
            isDead = false;
        }
        return isDead;
    }

    public static int shootAlien(){
        int damage;
        if(ammo >= 15) {
            damage = 25;
            System.out.println("The Human caused " + damage + " Damage on Alien but he lost 15 ammo.");
            ammo -= 15;
        }
        else {
            damage = 0;
            System.out.println("No ammo left for Human!");
        }
        return damage;
    }


}
