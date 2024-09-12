/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfoodkitchen2;

/**
 *
 * @author Jesudamilare
 */
public class BurgerOrder {
    private int numHamburgers = 0;
    private int numCheeseburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    private boolean orderToGo = false;
    private int orderNum = 1;

    public BurgerOrder(int numHamburgers, int numCheeseburgers, int numVeggieburgers, int numSodas, boolean orderToGo, int orderNum) {
        this.numHamburgers = numHamburgers;
        this.numCheeseburgers = numCheeseburgers;
        this.numVeggieburgers = numVeggieburgers;
        this.numSodas = numSodas;
        this.orderToGo = orderToGo;
        this.orderNum = orderNum;
    }
    public int getBurgerTotal(){
       int burgerAmount = this.getNumHamburgers() + this.getNumCheeseburgers() + this.getNumVeggieburgers();
        return burgerAmount;
    }
    
    

    public int getNumHamburgers() {
        return numHamburgers;
    }

    public void setNumHamburgers(int numHamburgers) {
        if (numHamburgers < 0) {
            System.out.println("Error, value is less than 0");
        }
        else {
            this.numHamburgers = numHamburgers;
        }
    }

    public int getNumCheeseburgers() {
        return numCheeseburgers;
    }

    public void setNumCheeseburgers(int numCheeseburgers) {
        if (numCheeseburgers < 0) {
            System.out.println("Error, value is less than 0");
        }
        else{
            this.numCheeseburgers = numCheeseburgers;
        }
    }

    public int getNumVeggieburgers() {
        return numVeggieburgers;
    }

    public void setNumVeggieburgers(int numVeggieburgers) {
        if (numVeggieburgers < 0) {
            System.out.println("Error, value is less than 0");
        }
        else {
            this.numVeggieburgers = numVeggieburgers;
        }
    }

    public int getNumSodas() {
        return numSodas;
    }

    public void setNumSodas(int numSodas) {
        if (numSodas < 0) {
            System.out.println("Error, value is less than 0");
        }
        else {
            this.numSodas = numSodas;
        }
    }

    public boolean isOrderToGo() {
        return orderToGo;
    }

    public void setOrderToGo(boolean orderToGo) {
        this.orderToGo = orderToGo;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public String toString() {
        return "BurgerOrder{" + "numHamburgers=" + numHamburgers + ", numCheeseburgers=" + numCheeseburgers + ", numVeggieburgers=" + numVeggieburgers + ", numSodas=" + numSodas + ", orderToGo=" + orderToGo + ", orderNum=" + orderNum + '}';
    }
    
}
