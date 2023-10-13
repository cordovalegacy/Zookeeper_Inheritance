public class Gorilla extends Mammal {

    public Gorilla(){
        super();
    }
    public Gorilla(int energyValue, int strengthValue){
        super();
    }

    public void setThrowSomething(){
        System.out.println("Threw Something!");
        super.decreaseStats(10, 5);
    }

    public void setClimb(){
        System.out.println("Climbed Something!");
        super.decreaseStats(20, 10);
    }

    public void setEatBanana(){
        System.out.println("Yummy Banana!");
        super.increaseStats(50, 5);
    }

}
