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
public class CD extends Product{
    private String cDTitle = null;
    public CD(int ID, int productNum, String title) {
        super(ID, productNum);
        this.cDTitle = title;
    }

    public String getTitle() {
        return cDTitle;
    }

    public void setTitle(String title) {
        this.cDTitle = title;
    }
    
}
