/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chanhnguyen
 */
public class user {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CoffeeMaker myCoffeeMaker = CoffeeMaker.getInstance();
        myCoffeeMaker.addBeans(50);
        myCoffeeMaker.addWater(70);
        myCoffeeMaker.makeCoffee(10, 3);
        myCoffeeMaker.pressOn();
        myCoffeeMaker.pluggingPower();
        myCoffeeMaker.pressOn();
        myCoffeeMaker.makeCoffee(5, 10);
    }
    
}
