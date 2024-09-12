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
public class premiumMember extends Member{
    private boolean feePaid = false;
    public premiumMember(int iDNum, String name, boolean feePaid) {
        super(iDNum, name);
        this.feePaid = feePaid;
    }

    public void setFeePaid(boolean feePaid) {
        this.feePaid = feePaid;
    }

    public boolean isFeePaid() {
        return feePaid;
    }
    
}
