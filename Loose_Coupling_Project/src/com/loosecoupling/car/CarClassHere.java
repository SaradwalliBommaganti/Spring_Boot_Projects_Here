package com.loosecoupling.car;
import com.loosecoupling.engine.IEngine;
import com.loosecoupling.engine.PetrolEngine;

public class CarClassHere {
    public IEngine engine;
    public CarClassHere(IEngine engine) {
        this.engine = engine;
    }
    void startCarHere(){
        String engineHere = engine.engineHere();
        System.out.println("car is runing with"+"-"+engineHere);
    }
    public static void main(String[] args) {
        CarClassHere carClassHere = new CarClassHere(new PetrolEngine());
        carClassHere.startCarHere();
    }
}
