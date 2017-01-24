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
public class OnOffButton implements IsOn {

    private boolean isOn;

    public OnOffButton() {
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        if (this.isOn) {
            System.out.println("It is already On");
        } else {
            this.isOn = true;
            System.out.println("It is now turned on");
        }
    }

    @Override
    public void turnOff() {
        if (this.isOn) {
            this.isOn = false;
            System.out.println("It is now turned off");           
        } else {
            System.out.println("It is already Off");
        }
    }

    @Override
    public boolean getIsOn() {
        return this.isOn;
    }
}
