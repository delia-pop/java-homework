package Week5Homework;

public class BattleTest {

    public static void main(String[] args) {

        Human human = new Human();
        Alien alien = new Alien();

        alien.biteHuman(human);
        human.shootAlien(alien);
        human.shootAlien(alien);
        alien.biteHuman(human);
        alien.biteHuman(human);
        alien.biteHuman(human);
        alien.biteHuman(human);
        alien.biteHuman(human);




    }
}
