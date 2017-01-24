/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Container;

/**
 *
 * @author chanhnguyen
 */
public class WaterContainer implements Container {

    private final int MAXWATERCAPACITY = 100;
    private int waterAmount;

    public WaterContainer() {
        this.waterAmount = 0;
    }

    @Override
    public void setAmount(int amount) {
        this.waterAmount = Math.min(amount, this.MAXWATERCAPACITY);
        System.out.println("Water added");
    }

    @Override
    public int getAmount() {
        return this.waterAmount;
    }
}
