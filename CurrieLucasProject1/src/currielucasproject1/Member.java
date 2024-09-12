/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currielucasproject1;

/**
 *
 * @author lucas
 */
public class Member {
    private int iDNum = 0;
    private String name = null;
    private double moneySpent = 0.0;
    
    
    public Member(int iDNum, String name){
        this.iDNum = iDNum;
        this.name = name;
    }

    public int getiDNum() {
        return iDNum;
    }

    public String getName() {
        return name;
    }

    public double getMoneySpent() {
        return moneySpent;
    }

    public void setiDNum(int iDNum) {
        this.iDNum = iDNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoneySpent(double moneySpent) {
        this.moneySpent = moneySpent;
    }
    
}
