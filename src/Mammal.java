public class Mammal {
    private int energy;
    private int strength;

    public Mammal(){
        this.energy = 100;
        this.strength = 100;
    }

    public Mammal(int energyValue, int strengthValue){
        this.energy += energyValue;
        this.strength += strengthValue;
    }

    // Getters/Setters
    public boolean getStats(){
        System.out.println("Energy: " + this.energy + "\n" + "Strength: " + this.strength);
        return true;
    }

    public void decreaseStats(int energyValue, int strengthValue){
        this.energy -= energyValue;
        this.strength -= strengthValue;
    }
    public void increaseStats(int energyValue, int strengthValue){
        this.energy += energyValue;
        this.strength += strengthValue;
    }
}

