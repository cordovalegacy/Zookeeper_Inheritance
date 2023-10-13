public class Main {
    public static void main(String[] args) {
        System.out.println("<--Running Main-->");

        Gorilla Harambe = new Gorilla(60, 100);
        Bat Fawnsworth = new Bat(95, 30);
        Bat Bruce = new Bat();

        Harambe.setThrowSomething();
        Harambe.setThrowSomething();
        Harambe.setThrowSomething();
        Harambe.setClimb();
        Harambe.setEatBanana();
        Harambe.setEatBanana();
        Bruce.setFly();
        Fawnsworth.setFly();
        Fawnsworth.setEatHumans();
        Fawnsworth.setAttackTown();
        System.out.println(Harambe.getStats());
        System.out.println(Fawnsworth.getStats());
        System.out.println(Bruce.getStats());
    }
}