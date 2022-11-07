package com.kevin.animals;

public class Bat extends Gorilla {
    private void batEnergy(){
        this.energyLevel = 300;
    }
    //simply bat constructor
    public Bat() {
        batEnergy();
    }
    public void fly() {
        System.out.println("the bat is flying (flap flap flap");
        this.energyLevel -= 50;
        displayEnergy();

    }
    public void throwSomething() {
        System.out.println("bats can't throw");
    }
    public void eatBanana(){
        System.out.println("bats dont eat bananas");
    }
    public void climb(){
        System.out.println("the bat climbs clumsily");
        this.energyLevel -= 10;
        displayEnergy();
    }
    public void eatHumans(){
        System.out.println("the bat is swooping down and eating humans! (nom nom nom");
        this.energyLevel += 25;
        displayEnergy();
    }
    public void attackTown(){
        System.out.println("the bat is attacking the town. Run for your lives!");
        this.energyLevel += 100;
        displayEnergy();
    }
}

