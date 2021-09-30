package Week5Homework;

public class Alien implements Character {

    private int health;
    private static int energy;

    public Alien(){
        this.health = 200;
        this.energy = 100;
    }

    @Override
    public int getHealth() {
        return health;

    }

    public int getEnergy(){
        return energy;

    }

    @Override
    public int setHealth() {
        health = health - Human.shootAlien();
        if(health <=0){
            health = 0;
            isDead();
        }
        return health;
    }

    @Override
    public boolean isDead() {
        boolean isDead;
        if(health <=0 ) {
            isDead = true;
            System.out.println("The Alien is dead!");
        } else {
            isDead = false;
        }
        return isDead;
    }

    public static int biteHuman(){

        int damage;
        if(energy >= 80) {
            damage = 25;
            System.out.println("Alien caused " + damage + " Damage on human but he lost 10 energy points.");
            energy -= 10;
        } else if (energy >= 50) {
            damage = 15;
            System.out.println("Alien caused " + damage + " Damage on human but he lost 10 energy points.");
            energy -= 10;
        } else if(energy >= 10) {
            damage = 10;
            System.out.println("Alien caused " + damage + " Damage on human but he lost 10 energy points.");
            energy -= 10;
        } else {
            damage = 0;
            System.out.println("No energy left for Alien!");
        }
        return damage;
    }
}
