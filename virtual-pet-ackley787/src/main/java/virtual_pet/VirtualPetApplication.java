package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        int choice;

        String bark = "Ruff ruff ";
        String whine = "...hmmm...hmmmm...";
        String scratch = "scratches at the backdoor " + bark + bark;

        System.out.println("Hello Welcome to Virtual Pet");
        System.out.println("It's a virtual dog simulation");
        System.out.println("Enter the name of your dog");

        Scanner name = new Scanner(System.in);
        String petName = name.nextLine();

        System.out.println("What is the breed of your dog?");

        Scanner input = new Scanner(System.in);
        String breed = input.nextLine();
        VirtualPet pet = new VirtualPet(petName, breed, 20, 20, 20, 20);

        System.out.println("You have a " + breed + " named " + petName);
        System.out.println("");
        System.out.println("Hello " + petName);
        System.out.println("");
        System.out.println(petName + " barks at you and it's tail wags");

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("How would you like to interact with your dog?");
            System.out.println("");
            System.out.println("Press 1 to ask " + petName + " if he/she is hungry");
            System.out.println("Press 2 to ask " + petName + " if he/she is thirsty");
            System.out.println("Press 3 to ask " + petName + " if he/she wants to play");
            System.out.println("Press 4 to ask " + petName + " if he/she has to go potty");
            System.out.println("Press 5 to check " + petName + " status");
            System.out.println("Press 6 to exit");

            choice = input.nextInt();

            if (choice == 6) {
                continue;
                //Food
            } else if (choice == 1) {
                if (pet.getHunger() >= 25) {
                    System.out.println("Are you hungry " + petName + " ?");
                    System.out.println(whine + bark + " that's enough food I'm gonna puke");
                    System.out.println(petName + "'s food bowl is full ");
                    System.out.println("Please make another choice");
                    System.out.println("");

                    pet.removeHunger();
                    pet.addThirst();
                    pet.addBoredom();
                    pet.addOutside();
                    pet.check();

                    System.out.println(pet.getCheckHunger());
                    System.out.println(pet.getCheckThirst());
                    System.out.println(pet.getCheckBoredom());
                    System.out.println(pet.getCheckOutside());

                    continue;

                } else if (pet.getOutside() >= 30) {

                    System.out.println("Are you hungry " + petName + " ?");
                    System.out.println(scratch + "Open the door human before I leave you presents");
                    System.out.println("You let " + petName + " outside to go potty");
                    System.out.println("Please make another choice");
                    System.out.println("");

                    pet.addHunger();
                    pet.addThirst();
                    pet.addBoredom();
                    pet.removeOutside();
                    pet.check();

                    System.out.println(pet.getCheckHunger());
                    System.out.println(pet.getCheckThirst());
                    System.out.println(pet.getCheckBoredom());
                    System.out.println(pet.getCheckOutside());

                    continue;

                } else if ((pet.getHunger()) <= 20) {

                    System.out.println("Are you hungry " + petName + " ?");
                    System.out.println("I want people food give me pizza");
                    System.out.println("you give " + petName + " some food");
                    System.out.println("num...num...num");
                    System.out.println("");

                    pet.addHunger();
                    pet.addThirst();
                    pet.addBoredom();
                    pet.addOutside();
                    pet.check();

                    System.out.println(pet.getCheckHunger());
                    System.out.println(pet.getCheckThirst());
                    System.out.println(pet.getCheckBoredom());
                    System.out.println(pet.getCheckOutside());

                    continue;

                }
            } else if (choice == 2) {
                if (pet.getThirsty() >= 25) {

                    System.out.println("Do you want some water " + petName + " ?");
                    System.out.println("If you give me anymore water I'm gonna puke!");
                    System.out.println(petName + "'s water bowl is full ");
                    System.out.println("Please make another choice");
                    System.out.println("");

                    pet.addHunger();
                    pet.removeThirst();
                    pet.addBoredom();
                    pet.removeOutside();
                    pet.check();

                    System.out.println(pet.getCheckHunger());
                    System.out.println(pet.getCheckThirst());
                    System.out.println(pet.getCheckBoredom());
                    System.out.println(pet.getCheckOutside());

                    continue;

                } else if (pet.getOutside() >= 30) {

                    System.out.println("Do you want some water " + petName + " ?");
                    System.out.println(scratch + "Open the door human before I leave you presents");
                    System.out.println("You let " + petName + " outside to go potty");
                    System.out.println("Please make another choice");
                    System.out.println("");

                    pet.addHunger();
                    pet.addThirst();
                    pet.addThirst();
                    pet.removeOutside();
                    pet.check();

                    System.out.println(pet.getCheckHunger());
                    System.out.println(pet.getCheckThirst());
                    System.out.println(pet.getCheckBoredom());
                    System.out.println(pet.getCheckOutside());

                    continue;

                } else if ((pet.getThirsty()) <= 20) {

                    System.out.println("Do you want some water " + petName + " ?");
                    System.out.println("I drank all my water fill my bowl human");
                    System.out.println("You add water to " + petName + " water bowl ");
                    System.out.println("Please make another choice");
                    System.out.println("");

                    pet.addHunger();
                    pet.addThirst();
                    pet.addBoredom();
                    pet.addOutside();
                    pet.check();

                    System.out.println(pet.getCheckHunger());
                    System.out.println(pet.getCheckThirst());
                    System.out.println(pet.getCheckBoredom());
                    System.out.println(pet.getCheckOutside());

                    continue;
                }
            } else if (choice == 3) {
                if (pet.getBored() <= 11) {

                    System.out.println("Do you want to play " + petName + " ?");
                    System.out.println(bark + petName + " Yawns....I'm gonna take a nap");
                    System.out.println(petName + " lays down and takes a nap");
                    System.out.println("");

                    pet.addHunger();
                    pet.addThirst();
                    pet.removeBoredom();
                    pet.addOutside();
                    pet.check();

                    System.out.println(pet.getCheckHunger());
                    System.out.println(pet.getCheckThirst());
                    System.out.println(pet.getCheckBoredom());
                    System.out.println(pet.getCheckOutside());

                    continue;

                } else if (pet.getOutside() >= 30) {

                    System.out.println("Do you want to play " + petName + " ?");
                    System.out.println(scratch + "Open the door human before I leave you presents");
                    System.out.println("You let " + petName + " outside to go potty");
                    System.out.println("Please make another choice");
                    System.out.println("");

                    pet.addHunger();
                    pet.addThirst();
                    pet.addBoredom();
                    pet.removeOutside();
                    pet.check();

                    System.out.println(pet.getCheckHunger());
                    System.out.println(pet.getCheckThirst());
                    System.out.println(pet.getCheckBoredom());
                    System.out.println(pet.getCheckOutside());

                    continue;

                } else if (pet.getBored() >= 20) {

                    System.out.println("Do you want to play " + petName + " ?");
                    System.out.println("I'll go get my squeaky toy human");
                    System.out.println("You play with " + petName + " 15 mins.");
                    System.out.println("");

                    pet.addHunger();
                    pet.addThirst();
                    pet.removeBoredom();
                    pet.addOutside();
                    pet.check();

                    System.out.println(pet.getCheckHunger());
                    System.out.println(pet.getCheckThirst());
                    System.out.println(pet.getCheckBoredom());
                    System.out.println(pet.getCheckOutside());

                    continue;

                }
                //let outside
            } else if (choice == 4) {
                if (pet.getOutside() <= 25) {

                    System.out.println(petName + " Do you have to go potty " + petName + "?");
                    System.out.println(petName + " lays down");
                    System.out.println(petName + " doesn't need to go potty");
                    System.out.println("");

                    pet.addHunger();
                    pet.addThirst();
                    pet.addBoredom();
                    pet.addOutside();
                    pet.check();

                    System.out.println(pet.getCheckHunger());
                    System.out.println(pet.getCheckThirst());
                    System.out.println(pet.getCheckBoredom());
                    System.out.println(pet.getCheckOutside());

                    continue;

                } else if (pet.getOutside() >= 30) {

                    System.out.println(petName + " Do you have to go potty?");
                    System.out.println(scratch + " Open the door human before I leave you presents");
                    System.out.println("You let " + petName + " outside to go potty");
                    System.out.println("Please make another choice");
                    System.out.println("");

                    pet.addHunger();
                    pet.addThirst();
                    pet.addBoredom();
                    pet.removeOutside();
                    pet.check();

                    System.out.println(pet.getCheckHunger());
                    System.out.println(pet.getCheckThirst());
                    System.out.println(pet.getCheckBoredom());
                    System.out.println(pet.getCheckOutside());

                    continue;

                }
            } else if (choice == 5) {

                System.out.println("You check on " + petName);
                pet.check();
                System.out.println("");

                System.out.println(pet.getCheckHunger());
                System.out.println(pet.getCheckThirst());
                System.out.println(pet.getCheckBoredom());
                System.out.println(pet.getCheckOutside());

                continue;

            } else {
                System.out.println(petName + " looks at you and tilts his/her head in confusion");
                System.out.println("Error human please try again");

                pet.check();

                System.out.println("");
                System.out.println(pet.getCheckHunger());
                System.out.println(pet.getCheckThirst());
                System.out.println(pet.getCheckBoredom());
                System.out.println(pet.getCheckOutside());

                continue;

            }

        } while (choice != 6);
        System.out.println("Thank you for playing GoodBye!!!");

    }

}

