package com.CarClass;

import com.engineClasses.PetrolEngineHere;
// Tightly coupled Car class
public class CarStartHere {

    PetrolEngineHere petrolEngineHere = new PetrolEngineHere(); // Direct dependency on PetrolEngine

    public void driveStartHere(){
        petrolEngineHere.start();
        System.out.println("car started with petrol engine");

    }

}
