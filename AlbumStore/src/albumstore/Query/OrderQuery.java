/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package albumstore.Query;

/**
 *
 * @author USER
 */
public class OrderQuery {
    //public String create = ""
    public String get = "SELECT * FROM albums";
    public String showByTitle = "SELECT * FROM albums where title = ?";
    public String showByType = "SELECT * FROM albums where type LIKE ?"; 
}
