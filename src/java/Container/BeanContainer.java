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
public class BeanContainer implements Container {

    private final int MAXBEANCAPACITY = 100;
    private int beanAmount;

    public BeanContainer() {
        this.beanAmount = 0;
    }

    @Override
    public void setAmount(int amount) {
        this.beanAmount = Math.min(amount, this.MAXBEANCAPACITY);
        System.out.println("Bean added");
    }

    @Override
    public int getAmount() {
        return this.beanAmount;
    }
}
