/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoffeeMakerElectricComponent;

/**
 *
 * @author chanhnguyen
 */
public class Plug implements IsOn {

    private boolean isPlug;

    public Plug() {
        this.isPlug = false;
    }

    @Override
    public void turnOn() {
        if (this.isPlug) {
            System.out.println("It is already plugged");
        } else {
            this.isPlug = true;
            System.out.println("It is now plugged");
        }
    }

    @Override
    public void turnOff() {
        if (this.isPlug) {
            this.isPlug = false;
            System.out.println("It is now unplugged");
        } else {
            System.out.println("It is already unplugged");
        }
    }

    @Override
    public boolean getIsOn() {
        return this.isPlug;
    }

}
