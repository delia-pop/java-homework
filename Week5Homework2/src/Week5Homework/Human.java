package Week5Homework;

public class Human implements Character {

    private int health;
    private int ammo;
    private boolean isDead;

    public Human() {
        this.health = 100;
        this.ammo = 200;
    }

    @Override
    public int getHealth() {

        return health;
    }

    public int getAmmo() {

        return ammo;
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
        if (health <= 0) {
            isDead = true;
        } else {
            isDead = false;
        }
        return isDead;
    }

    public void shootAlien(Alien alien) {

        if (!alien.isDead()) {
            int damage;
            if (ammo >= 15) {
                damage = 25;
                System.out.println("The Human caused " + damage + " Damage on Alien but he lost 15 ammo.");
                ammo -= 15;
            } else {
                damage = 0;
                System.out.println("No ammo left for Human!");
            }

            //System.out.println("Alien's health is " + alien.getHealth() + " and Human's ammo is " + getAmmo());
            if (alien.getHealth() >= damage) {
                alien.setHealth(alien.getHealth() - damage);
                System.out.println("Alien's health after fire is " + alien.getHealth() + " and the Human's ammo is down to " + getAmmo());
                System.out.println("\n");
            } else {
                System.out.println("\n");
                System.out.println("Alien is dead! Human ammo is " + getAmmo());
                alien.setHealth(0);
            }
            return;

        } else {
            System.out.println("Alien is already dead! ");
            return;
        }


    }


}
