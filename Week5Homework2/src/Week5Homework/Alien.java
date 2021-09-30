package Week5Homework;

public class Alien implements Character {

    private int health;
    private int energy;
    private boolean isDead;

    public Alien() {
        this.health = 200;
        this.energy = 100;
    }

    public void setEnergy(int energy) {
        this.energy = energy;

    }

    @Override
    public int getHealth() {
        return health;

    }

    public int getEnergy() {
        return energy;

    }

    @Override
    public int setHealth(int health) {
        this.health = health;
        if (health <= 0) {
            health = 0;
            isDead();
        }
        return health;
    }

    @Override
    public boolean isDead() {
        boolean isDead;
        if (health <= 0) {
            isDead = true;
        } else {
            isDead = false;
        }
        return isDead;
    }

    public void biteHuman(Human human) {


        if (!human.isDead()) {
            int damage;
            if (energy >= 80) {
                damage = 25;
                System.out.println("Alien caused " + damage + " Damage on human but he lost 10 energy points.");
                energy -= 10;
            } else if (energy >= 50) {
                damage = 15;
                System.out.println("Alien caused " + damage + " Damage on human but he lost 10 energy points.");
                energy -= 10;
            } else if (energy >= 10) {
                damage = 10;
                System.out.println("Alien caused " + damage + " Damage on human but he lost 10 energy points.");
                energy -= 10;
            } else {
                damage = 0;
                System.out.println("No energy left for Alien!");
            }


            if (human.getHealth() >= damage) {
                human.setHealth(human.getHealth() - damage);
                System.out.println("Human's health after attack is " + human.getHealth() + " and Alien's energy is " + getEnergy());
                System.out.println("\n");
            } else {
                System.out.println("\n");
                System.out.println("Human is dead! Alien energy is " + getEnergy());
                human.setHealth(0);
            }
            return;


        } else {
            System.out.println("Human is already dead! ");
            return;
        }


    }
}
