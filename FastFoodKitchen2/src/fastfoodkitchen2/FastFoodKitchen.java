/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfoodkitchen2;

import java.util.ArrayList;
import java.util.Timer;
import java.util.Random;

/**
 *
 * @author Jesudamilare
 */
public class FastFoodKitchen {
    private ArrayList<BurgerOrder> orderList = new ArrayList<>();
    private static int nextOrderNum;
    
    public FastFoodKitchen() {
        orderList.add(new BurgerOrder(3, 5, 4, 10, false, getNextOrderNum()));
        incrementNextOrderNum();
        
        orderList.add(new BurgerOrder(0, 0, 3, 3, true, getNextOrderNum()));
        incrementNextOrderNum();
        
        orderList.add(new BurgerOrder(1, 1, 0, 2, false, getNextOrderNum()));
        incrementNextOrderNum();
    }
    public int findOrderSeq(int orderID){
        for (int i = 0; i<orderList.size(); i++)
        {
            if(orderList.get(i).getOrderNum() == orderID)
            {
                return i;
            }
            
        }
        return -1;
    }
    
    public int findOrderBin(int orderID){
        int mid;
        int left = 0;
        int right = orderList.size()-1;
        
            while(left <= right)
            {
                mid = (right + left) / 2;
                if (orderID > orderList.get(mid).getOrderNum())
                {
                    left = mid + 1;
                }
                else if (orderID > orderList.get(mid).getOrderNum())
                        {
                        right = mid -1;
                        }
                else
                        {
                        return mid;
                        }
            }
            return -1;
        }
    public void selectionSort()
    {
        for(int i = 0; i < orderList.size() - 1; i++)
        {
            int indexSmallest = i;
            for (int j = i + 1; j < orderList.size(); j++)
            {
                if (orderList.get(j).getBurgerTotal() < orderList.get(indexSmallest).getBurgerTotal())
                {
                    indexSmallest = j;
                }
            }
            BurgerOrder temp = orderList.get(i); 
            orderList.set(i, orderList.get(indexSmallest));
            orderList.set(indexSmallest, temp);
        }
    }
    
    public void insertionSort() 
    {
        for(int i = 1; i < orderList.size(); i++)
        {
            int j = i;
            while(j>0 && orderList.get(j).getBurgerTotal() < orderList.get(j-1).getBurgerTotal())
            {
                BurgerOrder temp = orderList.get(j);
                orderList.set(j, orderList.get(j-1));
                orderList.set(j-1, temp);
                j--;
            }
        }
    }
    

    public static int getNextOrderNum() {
        return nextOrderNum;
    }
    public static void incrementNextOrderNum(){
        nextOrderNum++;
    }
    
    public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo){
        orderList.add(new BurgerOrder(ham, cheese, veggie, soda, toGo, getNextOrderNum()));
        incrementNextOrderNum();
        return getNextOrderNum();
    }
    
    public boolean cancelLastOrder(){
        if (orderList.size() > 0){
           orderList.remove(orderList.size()-1);
            nextOrderNum--; 
            return true;
        }
        else{
            return false;
        }
        
    }
    public int getNumOrdersPending(){
        return orderList.size();
    }
    /*
    public boolean isOrderDone(int orderID){
        for (int i=0; i<orderList.size(); i++)
        {
            if(orderID == orderList.get(i).getOrderNum()){
                return false;
            }
        }
        return true;
    }*/
    /**
     * This method cancels a specific order
     * @param orderID
     * @return a boolean that represents if it is cancelled or not
     */
    public boolean cancelOrder(int orderID) {
        for (int i=0; i<orderList.size(); i++)
        {
            if(orderID == orderList.get(i).getOrderNum()){
                orderList.remove(i);
                return true;
            }
        }
        return false;
    }
   

    @Override
    public String toString() {
        return "FastFoodKitchen{" + "orderList=" + orderList + '}';
    }
    
            
    

    
    
   
}
