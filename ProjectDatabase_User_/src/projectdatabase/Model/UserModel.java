/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdatabase.Model;

/**
 *
 * @author USER
 */
//public String showByTitle = "SELECT * FROM product where title = ?";
    //public String showByArtist = "SELECT * FROM product where artist LIKE = ?";
    //public String showByYears = "SELECT * FROM product where years LIKE = ?";
    //public String showByPrice = "SELECT * FROM product where price LIKE = ?";
    //public String showByStock
public class UserModel {
    private String Title;
    private String Artist;
    private String Years;
    private String Price;
    private String Stock;

    public String getTitle() {
        return Title;
    }

    public String getArtist() {
        return Artist;
    }

    public String getYears() {
        return Years;
    }

    public String getPrice() {
        return Price;
    }

    public String getStock() {
        return Stock;
    }

}