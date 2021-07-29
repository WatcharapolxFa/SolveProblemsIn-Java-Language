public class App {
    public static void main(String[] args) {
        Ironman NewHero = new Ironman();
        NewHero.setName("Ironman");
        NewHero.setage("50");
        NewHero.disPlaySuperHero();
        NewHero.skill("Shoot");
        NewHero.skill("Shoot");

        Spiderman TwoHero = new Spiderman();
        TwoHero.setName("Spiderman");
        TwoHero.setage("19");

        TwoHero.disPlaySuperHero();
        TwoHero.weapon("Spider web");

    }

}
