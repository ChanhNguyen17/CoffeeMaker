package mainPackage;


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
    
    private final Container waterContainer;
    private final Container beanContainer;
    
    private final IsOn onOffButton;
    
    private CoffeeMaker() {
        this.waterContainer = new WaterContainer();
        this.beanContainer = new BeanContainer();
        this.onOffButton = new OnOffButton();
    }

    public static CoffeeMaker getInstance() {
        return CoffeeMakerHolder.INSTANCE;
    }

    private static class CoffeeMakerHolder {

        private static final CoffeeMaker INSTANCE = new CoffeeMaker();
    }

    public boolean getIsOn() {
        return onOffButton.getIsOn();
    }

    public int getBeanAmount() {
        return this.beanContainer.getAmount();
    }

    public int getWaterAmount() {
        return this.waterContainer.getAmount();
    }

    public void pressOnOff() {        
        this.onOffButton.pressed();
    }

    public void addBean(int beanAmount) {
        this.beanContainer.setAmount(beanAmount);
    }

    public void addWater(int waterAmount) {
        this.waterContainer.setAmount(waterAmount);
    }

    public boolean makeCoffee(int beanAmount, int waterAmount) {
        if(!this.getIsOn()){
            return false;
        }
        if (beanAmount < 0 || waterAmount < 0) {
            System.out.println("The infor is invalid");
            return false;
        } else if (beanAmount > this.beanContainer.getAmount()) {
            System.out.println("Not enough bean. Please add more");
            return false;
        } else if (waterAmount > this.waterContainer.getAmount()) {
            System.out.println("Not enough water. Please add more");
            return false;
        } else {
            this.beanContainer.setAmount(this.beanContainer.getAmount() - beanAmount);
            this.waterContainer.setAmount(this.waterContainer.getAmount() - waterAmount);
            System.out.println("Your coffee is ready with " + beanAmount + " bean and " + waterAmount + " water");
            return true;
        }
    }
}
