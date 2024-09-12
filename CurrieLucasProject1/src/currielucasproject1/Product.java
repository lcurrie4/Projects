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
public class Product {
    private int count = 0;
    private int Id = 0;
    public Product(int ID, int productNum){
        this.Id = ID;
        this.count = productNum;
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
