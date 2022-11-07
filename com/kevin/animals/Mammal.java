package com.kevin.animals;

public class Mammal{
    protected int energyLevel = 100;



//gets energy level
    public int displayEnergy(){
        System.out.println(energyLevel);
        return this.energyLevel;
    }
    
}