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
public class Book extends Product {
    private String bookTitle = null;
    private String title;
    public Book(int ID, int productNum, String title) {
        super(ID, productNum);
        this.title = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String title) {
        this.title = bookTitle;
    }
    
}
