package com.kevin.animals;

public class Gorilla extends Mammal {

    //could be a random weapn...
    public void throwSomething(){
        System.out.printf("the gorilla threw a %s", "rock");
        this.energyLevel -= 5;
        displayEnergy();
    }
    public void eatBanana() {
        System.out.println("the gorilla ate a banana");
        this.energyLevel += 10;
        displayEnergy();
    };
    public void climb(){
        System.out.println("the gorilla climbs!");
        this.energyLevel -= 10;
        displayEnergy();
    };

}

