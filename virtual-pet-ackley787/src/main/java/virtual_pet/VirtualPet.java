package virtual_pet;

public class VirtualPet {

    private String name;
    private String breed;
    private String checkHunger;
    private String checkThirst;
    private String checkBoredom;
    private String checkOutside;
    private int hunger;
    private int thirsty;
    private int bored;
    private int outside;

    public VirtualPet(String name, String breed, int hunger, int thirsty, int bored, int outside) {
        this.name = name;
        this.breed = breed;
        this.hunger = hunger;
        this.thirsty = thirsty;
        this.bored = bored;
        this.outside = outside;
    }

    public void check() {
        if (hunger >= 25) {
            this.checkHunger = ("I'm not hungry.");

        } else {
            this.checkHunger = ("I'm hungry.");
        }
        if (thirsty >= 25) {
            this.checkThirst = ("I'm not thirsty.");

        } else {
            this.checkThirst = ("I'm thirsty.");
        }
        if (bored >= 25) {
            this.checkBoredom = ("I'm bored and want to go play.");

        } else {
            this.checkBoredom = ("I'm getting tired.");
        }
        if (outside >= 25) {
            this.checkOutside = ("I gotta go potty.");

        } else {
            this.checkOutside = ("I don't really need to go potty.");
        }
    }

    public String getCheckHunger() {
        return checkHunger;
    }

    public String getCheckThirst() {
        return checkThirst;
    }

    public String getCheckBoredom() {
        return checkBoredom;
    }

    public String getCheckOutside() {
        return checkOutside;
    }

    public void removeHunger() {
        if (hunger >= 10)
            hunger -= 10;
        else
            hunger = 0;
    }

    public void addHunger() {
        if (hunger >= 10)
            hunger += 10;
        else
            hunger = 0;
    }

    public void removeThirst() {
        if (thirsty >= 10)
            thirsty -= 10;
        else
            thirsty = 0;
    }

    public void addThirst() {
        if (thirsty >= 10)
            thirsty += 10;
        else
            thirsty = 0;
    }

    public void removeBoredom() {
        if (bored >= 10)
            bored -= 10;
        else
            bored = 0;
    }

    public void addBoredom() {
        if (bored >= 10)
            bored += 10;
        else
            bored = 0;
    }

    public void removeOutside() {
        if (outside >= 10)
            outside -= 10;
        else
            outside = 0;
    }

    public void addOutside() {
        if (outside >= 10)
            outside += 10;
        else
            outside = 0;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirsty() {
        return thirsty;
    }

    public int getBored() {
        return bored;
    }

    public int getOutside() {
        return outside;
    }
}

