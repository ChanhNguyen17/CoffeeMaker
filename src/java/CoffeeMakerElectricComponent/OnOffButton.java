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
    public boolean getIsOn() {
        return this.isOn;
    }

    @Override
    public void pressed() {
        this.isOn = !isOn;
    }
}
