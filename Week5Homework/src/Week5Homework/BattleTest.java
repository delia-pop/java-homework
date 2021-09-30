package Week5Homework;

public class BattleTest {
    static Human human = new Human();
    static Alien alien = new Alien();

    public static void alienAttacks(){
        System.out.println("\n");
        System.out.println("Human's health is " + human.getHealth() + " and Alien's energy is " + alien.getEnergy());
        human.setHealth();
        System.out.println("Human's health is now " + human.getHealth() + " and Alien's energy is " + alien.getEnergy());
        System.out.println("\n");

    }

    public static void humanShoots(){
        //Human shoots the Alien.
        System.out.println("Alien's health is " + alien.getHealth() + " and Human's ammo is " + human.getAmmo());
       alien.setHealth();
        System.out.println("Alien's health after fire is " + alien.getHealth() + " and the Human's ammo is down to " + human.getAmmo());
        System.out.println("\n");

    }

    public static void main(String[] args) {
        alienAttacks();
        humanShoots();
        humanShoots();

        alienAttacks();
        alienAttacks();
        alienAttacks();
        alienAttacks();
    }
}
