/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currielucasproject1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author lucas
 */
 
public class Main {

    /**
     * @param args the command line arguments
     */
    ArrayList<Product> Stock = new ArrayList<Product>();
    public static void main(String[] args) {
    
    Product Fahrenheit451 = new Book(1,1,"Fahrenheit 451");
    Product OverTheHedge = new DVD(2,2, "Over The Hedge");
    Product TheWall = new CD(3,3, "The Wall");
        System.out.println(TheWall);
        System.out.println(Fahrenheit451);

        



 
         
    }
            public void addProduct(Product a){
            Stock.add(a);
        }
            public void sellProduct(Member customer,double price, Product a ){
                Stock.remove(a);
                double newSpend = 0;
                newSpend = customer.getMoneySpent() + price;
                customer.setMoneySpent(newSpend);
            }
            public void sellAllStock(){
                Stock = null;
            }
            public void browseStock(){
                System.out.println(Stock);
            }
            


            

                   
}
