public class Bat extends Mammal {

    public Bat(){
        super();
    }

    public Bat(int energyValue, int strengthValue){
        super();
    }

    public void setFly(){
        System.out.println("Fly!!");
        super.decreaseStats(50, 10);
    }

    public void setEatHumans(){
        System.out.println("Humans Tasty");
        super.increaseStats(25, 25);
    }

    public void setAttackTown(){
        System.out.println("Blah Blah Blah 🧛");
        setFly();
        super.decreaseStats(100, 25);
        setEatHumans();
        setEatHumans();
        setEatHumans();
    }
}
