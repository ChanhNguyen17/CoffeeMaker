
import CoffeeMakerElectricComponent.*;
import Container.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author chanhnguyen
 */
public class CoffeeMaker {
    
    private Container waterContainer;
    private Container beanContainer;
    
    private IsOn plug;
    private IsOn onOffButton;
    
    private CoffeeMaker() {
        this.waterContainer = new WaterContainer();
        this.beanContainer = new BeanContainer();
        this.plug = new Plug();
        this.onOffButton = new OnOffButton();
    }

    public static CoffeeMaker getInstance() {
        return CoffeeMakerHolder.INSTANCE;
    }

    private static class CoffeeMakerHolder {

        private static final CoffeeMaker INSTANCE = new CoffeeMaker();
    }

    public boolean getPlugged() {
        return plug.getIsOn();
    }

    public boolean getIsOn() {
        return onOffButton.getIsOn();
    }

    public int getBeansAmount() {
        return this.beanContainer.getAmount();
    }

    public int getWaterAmount() {
        return this.waterContainer.getAmount();
    }

    public void pluggingPower() {
        this.plug.turnOn();
    }

    public void unPluggingPower() {
        this.plug.turnOff();
    }

    public void pressOn() {        
        if (this.plug.getIsOn()) {
            this.onOffButton.turnOn();
        } else {
            System.out.println("You are not plugged");
        }
    }
    
    public void pressOff() {        
        if (this.plug.getIsOn()) {
            this.onOffButton.turnOff();
        } else {
            System.out.println("You are not plugged");
        }
    }

    public void addBeans(int beanAmount) {
        this.beanContainer.setAmount(beanAmount);
    }

    public void addWater(int waterAmount) {
        this.waterContainer.setAmount(waterAmount);
    }

    public void makeCoffee(int beanAmount, int waterAmount) {
        if (this.plug.getIsOn() && this.onOffButton.getIsOn()) {
            if (beanAmount < 0 || waterAmount < 0) {
                System.out.println("The infor is invalid");
            } else if (beanAmount > this.beanContainer.getAmount()) {
                System.out.println("Not enough bean. Please add more");
            } else if (waterAmount > this.waterContainer.getAmount()) {
                System.out.println("Not enough water. Please add more");
            } else {
                this.beanContainer.setAmount(this.beanContainer.getAmount() - beanAmount);
                this.waterContainer.setAmount(this.waterContainer.getAmount() - waterAmount);
                System.out.println("Your coffee is ready with " + beanAmount + " bean and " + waterAmount + " water");
            }
        } else {
            System.out.println("There is no power");
        }
    }
}
