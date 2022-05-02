/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdatabase.Query;

/**
 *
 * @author USER
 */
public class UserQuery {
    public String create = "INSERT INTO albums (title, artist, years, price, "
     + "stock) VALUES (?, ?, ?, ?, ?)";  
    public String get = "SELECT * FROM albums";
    public String showByTitle = "SELECT * FROM product where title = ?";
    public String showByArtist = "SELECT * FROM product where artist LIKE = ?";
    public String showByYears = "SELECT * FROM product where years LIKE = ?";
    public String showByPrice = "SELECT * FROM product where price LIKE = ?";
    public String showByStock = "SELECT * FROM product where stock LIKE = ?";
}
