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
public class DVD extends Product{
    private String movieTitle = null;
    public DVD(int ID, int productNum, String title) {
        super(ID, productNum);
        this.movieTitle = title;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
    
}
